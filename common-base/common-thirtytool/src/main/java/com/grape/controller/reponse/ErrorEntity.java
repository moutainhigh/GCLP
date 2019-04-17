package com.grape.controller.reponse;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.grape.util.Jacksons;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"}, ignoreUnknown = true)
public class ErrorEntity implements Response {

	private static final long serialVersionUID = 2276159541631114880L;

	/**
     * [M] 平台状态码
     */
    @JsonProperty("code")
    private int code;

    /**
     * [M] 错误信息
     */
    @JsonProperty("message")
    private String message;

    /**
     * [C] 详细错误信息
     */
    @JsonProperty("details")
    private Object details;

    public ErrorEntity(RestStatus statusCodes) {
        this(statusCodes, null);
    }

    public ErrorEntity(RestStatus statusCodes, Object details) {
        this.code = statusCodes.code();
        this.message = statusCodes.message();
        if (details != null) {
        	this.message += "[详细信息:"+details+"]";
            this.details = details;
        }else if(details==null){
        	this.details = "";
        }
    }

    @Override
    public String toString() {
        return "{" +
                "\"code\": " + code +
                ", \"message\": \"" + message + 
                "\", \"details\": " + Jacksons.parse(details) +
                '}';
    }
}
