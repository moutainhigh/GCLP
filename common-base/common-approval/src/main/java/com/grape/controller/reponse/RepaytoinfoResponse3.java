package com.grape.controller.reponse;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.grape.model.db.Bnkaccount;
import com.grape.model.db.Repaytoinfo;

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
public class RepaytoinfoResponse3 extends RestfulResponse{
	private static final long serialVersionUID = 8178288370714851790L;

    @ApiModelProperty(value = "", required = true,example="")
    private List<Repaytoinfo> obj;
    
    @ApiModelProperty(value="银行账户信息",required=true)
    private Bnkaccount bnkaccount;
}
