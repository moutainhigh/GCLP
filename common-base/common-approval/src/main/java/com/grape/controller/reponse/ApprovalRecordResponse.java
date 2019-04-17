package com.grape.controller.reponse;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.grape.controller.response.bean.PhoneVirification;
import com.grape.model.db.Chanapprovalform;


import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"}, ignoreUnknown = true)
public class ApprovalRecordResponse extends RestfulResponse{
	
	private static final long serialVersionUID = 1L;
	
	@ApiModelProperty(value = "审批信息", example = "", dataType="", required = true )
	private Chanapprovalform chanapprovalform;
	@ApiModelProperty(value = "电话核实信息", example = "", dataType="", required = true )
	private PhoneVirification phoneVirification;

}
