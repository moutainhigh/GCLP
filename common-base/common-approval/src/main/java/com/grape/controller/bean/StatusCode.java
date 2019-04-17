package com.grape.controller.bean;

import com.google.common.collect.ImmutableMap;
import com.grape.controller.reponse.RestStatus;

public enum StatusCode implements RestStatus {
	
	OK(20000, "请求成功"),
	
	NULL_CONTENT(28888, "请求内容为空"),
	
	FAIL(29999, "请求失败"),
	
	UNRECOGNIZE_CLIENT(10001, "未识别的客户端"),
	
	UNAUTHORIZED(10002,"未授权操作"),

	INVALID_TOKEN(10003,"无效的令牌"),
	
	VALID_ERROR(20001,"校验错误"),
	
	UNKNOWED_ERROR(99999,"未知错误"),
	
	NO_DATAERROR(20002,"查询暂无数据"),
	
	NO_EXCEPTERROR(20089,"暂无期待申请信息") ,
	
	NOWORKITEMFOUND_ERROR(20010,"流水项已转移或不存在") ;

    private final int code;
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
