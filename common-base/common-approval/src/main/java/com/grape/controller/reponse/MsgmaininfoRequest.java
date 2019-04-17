package com.grape.controller.reponse;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.grape.controller.request.RestfulRequest;
import com.grape.model.db.Mortgage;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"}, ignoreUnknown = true)
public class MsgmaininfoRequest extends RestfulRequest{
	private static final long serialVersionUID = 1L;

	@NotNull
	@NotBlank
	@Length(max=10,min=0,message="贷款流水号不能超出10位")
	@ApiModelProperty(value = "贷款流水号", example = "", dataType="varchar(10)", required = true )
    private String workid;

	@NotNull
	@NotBlank
	@Length(max=8,min=0,message="发送人不能超出8位")
	@ApiModelProperty(value = "发送人", example = "", dataType="varchar(8)", required = true )
    private String senduser;

	@NotNull
	@NotBlank
	@Length(max=8,min=0,message="接收人不能超出8位")
	@ApiModelProperty(value = "接收人", example = "", dataType="varchar(8)", required = true )
    private String recuser;

	@NotNull
	@NotBlank
	@Length(max=2,min=0,message="消息类型不能超出2位")
	@ApiModelProperty(value = "消息类型", example = "", dataType="varchar(2)", required = true )
    private String msgtype;

	@NotNull
	@NotBlank
	@ApiModelProperty(value = "", example = "", dataType="datetime", required = true )
    private Date chgdt;

	@NotNull
	@NotBlank
	@ApiModelProperty(value = "内容", example = "", dataType="longtext", required = true )
    private String content ;
}
