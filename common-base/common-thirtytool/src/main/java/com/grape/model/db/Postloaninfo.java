package com.grape.model.db;
import org.hibernate.validator.constraints.Length;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

//贷后信息表
public class Postloaninfo implements Serializable {
	@Length(max=10,min=0,message="流水编号不能超出10位")
	@ApiModelProperty(value = "流水编号", example = "", dataType="varchar(10)", required = true )
    private String workid;

	@Length(max=17,min=0,message="核准贷款金额不能超出17位")
	@ApiModelProperty(value = "核准贷款金额", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal approvedmoney;

	@Length(max=17,min=0,message="已经放款金额不能超出17位")
	@ApiModelProperty(value = "已经放款金额", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal alreadymoney;

	@Length(max=17,min=0,message="剩下放款金额不能超出17位")
	@ApiModelProperty(value = "剩下放款金额", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal remainamount;

	@ApiModelProperty(value = "首次放款日", example = "", dataType="datetime", required = true )
    private Date firstloandate;

	@ApiModelProperty(value = "结清日期", example = "", dataType="datetime", required = true )
    private Date settledate;

	@ApiModelProperty(value = "贷款到期日", example = "", dataType="datetime", required = true )
    private Date maturitydate;

	@Length(max=4,min=0,message="贷款期限不能超出4位")
	@ApiModelProperty(value = "贷款期限", example = "", dataType="varchar(4)", required = true )
    private String loantimelimit;

	@Length(max=32,min=0,message="还款方式不能超出32位")
	@ApiModelProperty(value = "还款方式", example = "", dataType="varchar(32)", required = true )
    private String repaymethod;

	@Length(max=9,min=0,message="贷款利率不能超出9位")
	@ApiModelProperty(value = "贷款利率", example = "", dataType="decimal(9,6)", required = true )
    private BigDecimal interestrate;

	@Length(max=4,min=0,message="利率类型不能超出4位")
	@ApiModelProperty(value = "利率类型", example = "", dataType="varchar(4)", required = true )
    private String interestratetype;

	@Length(max=9,min=0,message="名义利率不能超出9位")
	@ApiModelProperty(value = "名义利率", example = "", dataType="decimal(9,6)", required = true )
    private BigDecimal realinterestrate;

	@Length(max=4,min=0,message="名义利率类型不能超出4位")
	@ApiModelProperty(value = "名义利率类型", example = "", dataType="varchar(4)", required = true )
    private String realinterestratetype;

	@Length(max=17,min=0,message="贷款余额不能超出17位")
	@ApiModelProperty(value = "贷款余额", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal loanbalance;

	@Length(max=10,min=0,message="账户状态不能超出10位")
	@ApiModelProperty(value = "账户状态", example = "", dataType="varchar(10)", required = true )
    private String accountstate;

	@Length(max=1,min=0,message="逾期标识不能超出1位")
	@ApiModelProperty(value = "逾期标识", example = "", dataType="char(1)", required = true )
    private String overdueflg;

	@Length(max=6,min=0,message="逾期期数不能超出6位")
	@ApiModelProperty(value = "逾期期数", example = "", dataType="varchar(6)", required = true )
    private String overdueterm;

	@Length(max=17,min=0,message="逾期本金不能超出17位")
	@ApiModelProperty(value = "逾期本金", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal overduecorpus;

	@Length(max=17,min=0,message="逾期利息不能超出17位")
	@ApiModelProperty(value = "逾期利息", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal overdueaccrual;

	@Length(max=17,min=0,message="罚息不能超出17位")
	@ApiModelProperty(value = "罚息", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal defaultinterest;

	@ApiModelProperty(value = "上次逾期日", example = "", dataType="datetime", required = true )
    private Date overduedate;

	@ApiModelProperty(value = "下次还款日", example = "", dataType="datetime", required = true )
    private Date nextrepaydate;

	@Length(max=17,min=0,message="下次还款金额不能超出17位")
	@ApiModelProperty(value = "下次还款金额", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal nextrefundmoney;

	@Length(max=11,min=0,message="下次还款期号不能超出11位")
	@ApiModelProperty(value = "下次还款期号", example = "", dataType="int(11)", required = true )
    private Integer nextrefundissue;

	@Length(max=11,min=0,message="当前逾期天数不能超出11位")
	@ApiModelProperty(value = "当前逾期天数", example = "", dataType="int(11)", required = true )
    private Integer overduenum;

	@Length(max=11,min=0,message="累计逾期天数不能超出11位")
	@ApiModelProperty(value = "累计逾期天数", example = "", dataType="int(11)", required = true )
    private Integer addoverduedaynum;

	@Length(max=11,min=0,message="累计逾期次数不能超出11位")
	@ApiModelProperty(value = "累计逾期次数", example = "", dataType="int(11)", required = true )
    private Integer addoverduetimenum;

	@Length(max=1,min=0,message="每月还款日不能超出1位")
	@ApiModelProperty(value = "每月还款日", example = "", dataType="char(1)", required = true )
    private String repaydateofmonth;

	@Length(max=2,min=0,message="是否已读不能超出2位")
	@ApiModelProperty(value = "是否已读", example = "", dataType="varchar(2)", required = true )
    private String ishaveread;

    private static final long serialVersionUID = 1L;

    public String getWorkid() {
        return workid;
    }

    public void setWorkid(String workid) {
        this.workid = workid == null ? null : workid.trim();
    }

    public BigDecimal getApprovedmoney() {
        return approvedmoney;
    }

    public void setApprovedmoney(BigDecimal approvedmoney) {
        this.approvedmoney = approvedmoney;
    }

    public BigDecimal getAlreadymoney() {
        return alreadymoney;
    }

    public void setAlreadymoney(BigDecimal alreadymoney) {
        this.alreadymoney = alreadymoney;
    }

    public BigDecimal getRemainamount() {
        return remainamount;
    }

    public void setRemainamount(BigDecimal remainamount) {
        this.remainamount = remainamount;
    }

    public Date getFirstloandate() {
        return firstloandate;
    }

    public void setFirstloandate(Date firstloandate) {
        this.firstloandate = firstloandate;
    }

    public Date getSettledate() {
        return settledate;
    }

    public void setSettledate(Date settledate) {
        this.settledate = settledate;
    }

    public Date getMaturitydate() {
        return maturitydate;
    }

    public void setMaturitydate(Date maturitydate) {
        this.maturitydate = maturitydate;
    }

    public String getLoantimelimit() {
        return loantimelimit;
    }

    public void setLoantimelimit(String loantimelimit) {
        this.loantimelimit = loantimelimit == null ? null : loantimelimit.trim();
    }

    public String getRepaymethod() {
        return repaymethod;
    }

    public void setRepaymethod(String repaymethod) {
        this.repaymethod = repaymethod == null ? null : repaymethod.trim();
    }

    public BigDecimal getInterestrate() {
        return interestrate;
    }

    public void setInterestrate(BigDecimal interestrate) {
        this.interestrate = interestrate;
    }

    public String getInterestratetype() {
        return interestratetype;
    }

    public void setInterestratetype(String interestratetype) {
        this.interestratetype = interestratetype == null ? null : interestratetype.trim();
    }

    public BigDecimal getRealinterestrate() {
        return realinterestrate;
    }

    public void setRealinterestrate(BigDecimal realinterestrate) {
        this.realinterestrate = realinterestrate;
    }

    public String getRealinterestratetype() {
        return realinterestratetype;
    }

    public void setRealinterestratetype(String realinterestratetype) {
        this.realinterestratetype = realinterestratetype == null ? null : realinterestratetype.trim();
    }

    public BigDecimal getLoanbalance() {
        return loanbalance;
    }

    public void setLoanbalance(BigDecimal loanbalance) {
        this.loanbalance = loanbalance;
    }

    public String getAccountstate() {
        return accountstate;
    }

    public void setAccountstate(String accountstate) {
        this.accountstate = accountstate == null ? null : accountstate.trim();
    }

    public String getOverdueflg() {
        return overdueflg;
    }

    public void setOverdueflg(String overdueflg) {
        this.overdueflg = overdueflg == null ? null : overdueflg.trim();
    }

    public String getOverdueterm() {
        return overdueterm;
    }

    public void setOverdueterm(String overdueterm) {
        this.overdueterm = overdueterm == null ? null : overdueterm.trim();
    }

    public BigDecimal getOverduecorpus() {
        return overduecorpus;
    }

    public void setOverduecorpus(BigDecimal overduecorpus) {
        this.overduecorpus = overduecorpus;
    }

    public BigDecimal getOverdueaccrual() {
        return overdueaccrual;
    }

    public void setOverdueaccrual(BigDecimal overdueaccrual) {
        this.overdueaccrual = overdueaccrual;
    }

    public BigDecimal getDefaultinterest() {
        return defaultinterest;
    }

    public void setDefaultinterest(BigDecimal defaultinterest) {
        this.defaultinterest = defaultinterest;
    }

    public Date getOverduedate() {
        return overduedate;
    }

    public void setOverduedate(Date overduedate) {
        this.overduedate = overduedate;
    }

    public Date getNextrepaydate() {
        return nextrepaydate;
    }

    public void setNextrepaydate(Date nextrepaydate) {
        this.nextrepaydate = nextrepaydate;
    }

    public BigDecimal getNextrefundmoney() {
        return nextrefundmoney;
    }

    public void setNextrefundmoney(BigDecimal nextrefundmoney) {
        this.nextrefundmoney = nextrefundmoney;
    }

    public Integer getNextrefundissue() {
        return nextrefundissue;
    }

    public void setNextrefundissue(Integer nextrefundissue) {
        this.nextrefundissue = nextrefundissue;
    }

    public Integer getOverduenum() {
        return overduenum;
    }

    public void setOverduenum(Integer overduenum) {
        this.overduenum = overduenum;
    }

    public Integer getAddoverduedaynum() {
        return addoverduedaynum;
    }

    public void setAddoverduedaynum(Integer addoverduedaynum) {
        this.addoverduedaynum = addoverduedaynum;
    }

    public Integer getAddoverduetimenum() {
        return addoverduetimenum;
    }

    public void setAddoverduetimenum(Integer addoverduetimenum) {
        this.addoverduetimenum = addoverduetimenum;
    }

    public String getRepaydateofmonth() {
        return repaydateofmonth;
    }

    public void setRepaydateofmonth(String repaydateofmonth) {
        this.repaydateofmonth = repaydateofmonth == null ? null : repaydateofmonth.trim();
    }

    public String getIshaveread() {
        return ishaveread;
    }

    public void setIshaveread(String ishaveread) {
        this.ishaveread = ishaveread == null ? null : ishaveread.trim();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Postloaninfo other = (Postloaninfo) that;
        return (this.getWorkid() == null ? other.getWorkid() == null : this.getWorkid().equals(other.getWorkid()))
            && (this.getApprovedmoney() == null ? other.getApprovedmoney() == null : this.getApprovedmoney().equals(other.getApprovedmoney()))
            && (this.getAlreadymoney() == null ? other.getAlreadymoney() == null : this.getAlreadymoney().equals(other.getAlreadymoney()))
            && (this.getRemainamount() == null ? other.getRemainamount() == null : this.getRemainamount().equals(other.getRemainamount()))
            && (this.getFirstloandate() == null ? other.getFirstloandate() == null : this.getFirstloandate().equals(other.getFirstloandate()))
            && (this.getSettledate() == null ? other.getSettledate() == null : this.getSettledate().equals(other.getSettledate()))
            && (this.getMaturitydate() == null ? other.getMaturitydate() == null : this.getMaturitydate().equals(other.getMaturitydate()))
            && (this.getLoantimelimit() == null ? other.getLoantimelimit() == null : this.getLoantimelimit().equals(other.getLoantimelimit()))
            && (this.getRepaymethod() == null ? other.getRepaymethod() == null : this.getRepaymethod().equals(other.getRepaymethod()))
            && (this.getInterestrate() == null ? other.getInterestrate() == null : this.getInterestrate().equals(other.getInterestrate()))
            && (this.getInterestratetype() == null ? other.getInterestratetype() == null : this.getInterestratetype().equals(other.getInterestratetype()))
            && (this.getRealinterestrate() == null ? other.getRealinterestrate() == null : this.getRealinterestrate().equals(other.getRealinterestrate()))
            && (this.getRealinterestratetype() == null ? other.getRealinterestratetype() == null : this.getRealinterestratetype().equals(other.getRealinterestratetype()))
            && (this.getLoanbalance() == null ? other.getLoanbalance() == null : this.getLoanbalance().equals(other.getLoanbalance()))
            && (this.getAccountstate() == null ? other.getAccountstate() == null : this.getAccountstate().equals(other.getAccountstate()))
            && (this.getOverdueflg() == null ? other.getOverdueflg() == null : this.getOverdueflg().equals(other.getOverdueflg()))
            && (this.getOverdueterm() == null ? other.getOverdueterm() == null : this.getOverdueterm().equals(other.getOverdueterm()))
            && (this.getOverduecorpus() == null ? other.getOverduecorpus() == null : this.getOverduecorpus().equals(other.getOverduecorpus()))
            && (this.getOverdueaccrual() == null ? other.getOverdueaccrual() == null : this.getOverdueaccrual().equals(other.getOverdueaccrual()))
            && (this.getDefaultinterest() == null ? other.getDefaultinterest() == null : this.getDefaultinterest().equals(other.getDefaultinterest()))
            && (this.getOverduedate() == null ? other.getOverduedate() == null : this.getOverduedate().equals(other.getOverduedate()))
            && (this.getNextrepaydate() == null ? other.getNextrepaydate() == null : this.getNextrepaydate().equals(other.getNextrepaydate()))
            && (this.getNextrefundmoney() == null ? other.getNextrefundmoney() == null : this.getNextrefundmoney().equals(other.getNextrefundmoney()))
            && (this.getNextrefundissue() == null ? other.getNextrefundissue() == null : this.getNextrefundissue().equals(other.getNextrefundissue()))
            && (this.getOverduenum() == null ? other.getOverduenum() == null : this.getOverduenum().equals(other.getOverduenum()))
            && (this.getAddoverduedaynum() == null ? other.getAddoverduedaynum() == null : this.getAddoverduedaynum().equals(other.getAddoverduedaynum()))
            && (this.getAddoverduetimenum() == null ? other.getAddoverduetimenum() == null : this.getAddoverduetimenum().equals(other.getAddoverduetimenum()))
            && (this.getRepaydateofmonth() == null ? other.getRepaydateofmonth() == null : this.getRepaydateofmonth().equals(other.getRepaydateofmonth()))
            && (this.getIshaveread() == null ? other.getIshaveread() == null : this.getIshaveread().equals(other.getIshaveread()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getWorkid() == null) ? 0 : getWorkid().hashCode());
        result = prime * result + ((getApprovedmoney() == null) ? 0 : getApprovedmoney().hashCode());
        result = prime * result + ((getAlreadymoney() == null) ? 0 : getAlreadymoney().hashCode());
        result = prime * result + ((getRemainamount() == null) ? 0 : getRemainamount().hashCode());
        result = prime * result + ((getFirstloandate() == null) ? 0 : getFirstloandate().hashCode());
        result = prime * result + ((getSettledate() == null) ? 0 : getSettledate().hashCode());
        result = prime * result + ((getMaturitydate() == null) ? 0 : getMaturitydate().hashCode());
        result = prime * result + ((getLoantimelimit() == null) ? 0 : getLoantimelimit().hashCode());
        result = prime * result + ((getRepaymethod() == null) ? 0 : getRepaymethod().hashCode());
        result = prime * result + ((getInterestrate() == null) ? 0 : getInterestrate().hashCode());
        result = prime * result + ((getInterestratetype() == null) ? 0 : getInterestratetype().hashCode());
        result = prime * result + ((getRealinterestrate() == null) ? 0 : getRealinterestrate().hashCode());
        result = prime * result + ((getRealinterestratetype() == null) ? 0 : getRealinterestratetype().hashCode());
        result = prime * result + ((getLoanbalance() == null) ? 0 : getLoanbalance().hashCode());
        result = prime * result + ((getAccountstate() == null) ? 0 : getAccountstate().hashCode());
        result = prime * result + ((getOverdueflg() == null) ? 0 : getOverdueflg().hashCode());
        result = prime * result + ((getOverdueterm() == null) ? 0 : getOverdueterm().hashCode());
        result = prime * result + ((getOverduecorpus() == null) ? 0 : getOverduecorpus().hashCode());
        result = prime * result + ((getOverdueaccrual() == null) ? 0 : getOverdueaccrual().hashCode());
        result = prime * result + ((getDefaultinterest() == null) ? 0 : getDefaultinterest().hashCode());
        result = prime * result + ((getOverduedate() == null) ? 0 : getOverduedate().hashCode());
        result = prime * result + ((getNextrepaydate() == null) ? 0 : getNextrepaydate().hashCode());
        result = prime * result + ((getNextrefundmoney() == null) ? 0 : getNextrefundmoney().hashCode());
        result = prime * result + ((getNextrefundissue() == null) ? 0 : getNextrefundissue().hashCode());
        result = prime * result + ((getOverduenum() == null) ? 0 : getOverduenum().hashCode());
        result = prime * result + ((getAddoverduedaynum() == null) ? 0 : getAddoverduedaynum().hashCode());
        result = prime * result + ((getAddoverduetimenum() == null) ? 0 : getAddoverduetimenum().hashCode());
        result = prime * result + ((getRepaydateofmonth() == null) ? 0 : getRepaydateofmonth().hashCode());
        result = prime * result + ((getIshaveread() == null) ? 0 : getIshaveread().hashCode());
        return result;
    }
}
