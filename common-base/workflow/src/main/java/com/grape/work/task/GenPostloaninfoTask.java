package com.grape.work.task;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import lombok.extern.log4j.Log4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.grape.model.db.Postloaninfo;
import com.grape.model.db.Repayplan;
import com.grape.model.db.Repaytoinfo;
import com.grape.service.LoaninfoService;
import com.grape.workflow.Execution;

@Log4j
@Component
@Scope("prototype")
public class GenPostloaninfoTask implements WorkTask {

    @Autowired
    private LoaninfoService loaninfoService;

    @Override
    public TaskResult handle(Execution execution) {

        String workId = execution.getWorkId();

        //获取当前时间
        LocalDate localDate = LocalDate.now();
        Date nowDate = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());

        /*Date endDate = Date.from(LocalDateTime.ofInstant(LocalTime.now().toInstant(), ZoneId.systemDefault())
                .plusDays(1).atZone(ZoneId.systemDefault()).toInstant());*/

        //获取最终批复结果
        Repaytoinfo repaytoinfo = loaninfoService.getRepaytoinfo(workId);

        //获取放款申请信息
        //目前是全额放款，以批复信息为准即可，以后有分次放款应以放款申请数据为准，2018-08-15
        if (repaytoinfo != null) {
            //获取还款计划
            List<Repayplan> repayplanList = loaninfoService.getLastRepayplan(workId);
            Date matureDate = null;
            Repayplan firstPlan = null;
            if (repayplanList != null && !repayplanList.isEmpty()) {
                firstPlan = repayplanList.get(0);
                Repayplan plan = repayplanList.get(repayplanList.size() - 1);
                //到期日为最后一期的还款日(房抵贷)
                matureDate = plan.getRepaydate();
            } else {
                matureDate = Date.from(LocalDateTime.ofInstant(nowDate.toInstant(), ZoneId.systemDefault())
                        .plusDays(Long.valueOf(repaytoinfo.getLoanlimittime()) - 1).atZone(ZoneId.systemDefault()).toInstant());
            }
            //生成贷后信息，当前为全额放款
            Postloaninfo postloaninfo = new Postloaninfo();
            postloaninfo.setWorkid(workId);
            postloaninfo.setApprovedmoney(repaytoinfo.getSumofamount());
            //已放款金额
            postloaninfo.setAlreadymoney(repaytoinfo.getSumofamount());
            //剩余放款金额
            postloaninfo.setRemainamount(new BigDecimal(0));
            //首次放款日
            postloaninfo.setFirstloandate(nowDate);
            //到期日(根据首次放款日和批复表的利率类型计算)
            postloaninfo.setMaturitydate(matureDate);
            postloaninfo.setLoantimelimit(repaytoinfo.getLoanlimittime());
            postloaninfo.setRepaymethod(repaytoinfo.getRepaymethod());
            postloaninfo.setInterestrate(repaytoinfo.getInterestrate());
            postloaninfo.setInterestratetype(repaytoinfo.getInterestratetype());
            postloaninfo.setLoanbalance(repaytoinfo.getSumofamount());
            //正常
            postloaninfo.setAccountstate("00");
            if (firstPlan != null) {
                postloaninfo.setNextrepaydate(firstPlan.getRepaydate());
                //本金+利息
                postloaninfo.setNextrefundmoney(firstPlan.getRepaycapital().add(firstPlan.getRepayaccrual()));
                postloaninfo.setNextrefundissue(firstPlan.getRepayterm());

                Calendar cal = Calendar.getInstance();
                cal.setTime(firstPlan.getRepaydate());
                int day = cal.get(Calendar.DAY_OF_MONTH);
                //每月还款日
                postloaninfo.setRepaydateofmonth(String.valueOf(day));
            }
            //保存贷后信息
            loaninfoService.savePostloaninfo(postloaninfo);
        } else {
            log.info("批复信息查询失败，流水[" + workId + "]生成贷后信息失败");
        }

        return new TaskResult();
    }

}
