package com.grape.controller.bean;

import com.google.common.collect.ImmutableMap;
import com.grape.controller.reponse.RestStatus;

/**
 * @描述 状态枚举类, 用于存放接口状态码
 * @参数
 * @返回值
 * @创建人 zyh
 * @创建时间 2018/11/13 11:06
 */
public enum StatusCode implements RestStatus {


    //请求成功返回参数状态码
    OK(20000, "请求成功"),

    //未识别的客户端,客户端传参错误
    UNRECOGNIZE_CLIENT(10001, "未识别的客户端"),

    //没有权限
    UNAUTHORIZED(10002, "未授权操作"),

    //token令牌无效
    INVALID_TOKEN(10003, "无效的令牌"),

    //校验错误
    VALID_ERROR(20001, "校验错误"),

    //未知的错误
    UNKNOWED_ERROR(99999, "未知错误"),

    //请先还清逾期金额
    OVERDUE_RECORD(20002, "请先还清逾期金额"),

    //操作失败
    SAVEORUPDATE_ERROR(20003, "操作失败"),

    //未找到账户信息
    ACCOUNTNULL_ERROR(20004, "未找到账户信息"),

    //账户额度或保证金余额不足
    INSUFFICIENTAMOUNT_ERROR(20005, "账户额度或保证金余额不足"),

    //父级额度不能低于子额度总和
    ONE_ERROR(20006, "父级额度不能低于子额度总和"),

    //修改额度不能低于已用额度
    TWO_ERROR(20007, "修改额度不能低于已用额度"),

    //查看账户统计信息
    STATISTICAL_ACCOUNT_ERROR(30001, "查看账户统计信息失败"),

    //查看账户列表信息
    CHANNEL_SEE_ACCOUNT_ERROR(30002, "查看账户列表信息失败"),

    //查看交易记录
    SEE_TRADING_ERROR(30003, "查看交易记录失败"),

    //业务量统计
    BUSINESS_STATISTICS_ERROR(30004, "业务量统计失败"),

    //流水查询
    SELECT_DOCTASKLIST_ERROR(30005, "分页查询流水失败"),

    //查询待办
    SELECT_BACKLOGLIST_ERROR(30006, "分页查询待办失败"),

    //查询展期流水(Android)
    SELECT_ROLLOVERLIST_ERROR(30007, "分页查询展期流水(Android)失败"),

    //查询日志
    SELECT_LOGQUERYLIST_ERROR(30008, "分页查询日志失败"),

    //查询额度
    SELECT_QUOTALIST_ERROR(30009, "分页查询额度失败"),

    //查询地区额度
    SELECT_AREAQUOTA_ERROR(30010, "分页查看地区额度失败"),

    //查询查看变更记录
    SELECT_CHANGERECORD_ERROR(30011, "分页查询查看变更记录失败"),

    //新增变更记录
    SAVE_CHANGERECORD_ERROR(30012, "新增变更记录失败"),

    //流水额度变更
    UPDATE_ACCOUNTQUOTA_ERROR(30013, "流水额度变更失败"),

    //还款计划查询
    SELECT_RECORDSANDPLANS_ERROR(30014, "分页还款计划查询失败"),

    //生成还款计划
    SAVE_REPAYMENTPLAN_ERROR(30015, "生成还款计划失败"),

    //还款
    REPAY_INTERFACE_ERROR(30016, "还款失败"),

    //逾期统计信息
    SELECT_OVER_DUESTAT_ERROR(30017, "查询逾期统计信息失败"),

    //管理列表
    SELECT_MANAGERMENTLIST_ERROR(30018, "分页查询管理列表失败"),

    //分页查询原还款详情
    SELECT_REPAYMANAGEMENT_ERROR(30019, "分页查询原还款详情失败"),

    //展期还款详情
    SELECT_REPAYROLLOVER_ERROR(30020, "分页查询展期还款详情失败"),

    //查询原基本信息
    SELECT_BASICINFORMATION_ERROR(30021, "查询原基本信息失败"),

    //查询展期基本信息
    SELECT_BASICINFOROLLOVER_ERROR(30022, "查询展期基本信息失败"),

    //查询还款记录列表
    SELECT_REPAYMENTISTORY_ERROR(30023, "查询还款记录列表失败"),

    //查询逾期列表(Android)
    SELECT_OVERDUELIST_ERROR(30024, "查询逾期列表(Android)失败"),

    //查询还款提醒(Android)
    SELECT_PROPTPAYMENTS_ERROR(30025, "查询还款提醒(Android)失败"),

    //新增交易记录
    SAVE_TRADING_ERROR(30026, "新增交易记录失败"),

    //正常还款超额
    OVER_CAPITAL_OR_ACCRUAL_ERROR(30027, "还款利息或还款本金超过所需的额度,请输入正确的还款利息或还款本金"),


    NOT_OVERDUE_ERROR(30028, "该期无存在逾期记录，请正确还款"),

    OVER_OVERDUE_ERROR(30029, "输入的逾期金额超过所需还款的额度,请查看并输入正确的额度"),

    
    //逾期统计信息
    SELECT_OVERDUE_ERROR(30030, "存在逾期金额未还，暂不能还款"),

    ;

    /**
     * 状态码
     **/
    private final int code;

    /**
     * 消息内容
     **/
    private final String message;


    private static final ImmutableMap<Integer, StatusCode> CACHE;

    static {
        final ImmutableMap.Builder<Integer, StatusCode> builder = ImmutableMap.builder();
        for (StatusCode statusCode : values()) {
            builder.put(statusCode.code(), statusCode);
        }
        CACHE = builder.build();
    }

    StatusCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public static StatusCode valueOfCode(int code) {
        final StatusCode status = CACHE.get(code);
        if (status == null) {
            throw new IllegalArgumentException("No matching constant for [" + code + "]");
        }
        return status;
    }

    @Override
    public int code() {
        return code;
    }

    @Override
    public String message() {
        return message;
    }

}
