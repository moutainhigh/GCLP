package com.grape.controller.reponse;

import java.util.List;

import org.hibernate.validator.constraints.Length;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.grape.controller.bean.DebtinfoBean;

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
public class DebtinfoResponse extends RestfulResponse{
	private static final long serialVersionUID = 8178288370714851790L;

    @ApiModelProperty(value = "负债信息表(debtinfo)", required = true,example="")
    private List<DebtinfoBean> obj;
    
	@ApiModelProperty(value = "历史是否无民间借贷记录", example = "", dataType="varchar(4)", required = true )
    private String historicalhavaloanflg;
    
	@ApiModelProperty(value = "是否有民间借贷记录", example = "", dataType="char(1)", required = true )
    private String havaloanflg;
    
}
