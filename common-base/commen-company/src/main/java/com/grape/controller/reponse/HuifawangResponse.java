package com.grape.controller.reponse;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.grape.controller.reponse.bean.ChannelAssessinfo;
import com.grape.model.db.Litigationinfo;
import com.grape.model.db.Person;
import com.grape.model.db.Shixin;
import com.grape.model.db.Susong;

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
public class HuifawangResponse extends RestfulResponse {

    private static final long serialVersionUID = 8178288370714851790L;

    @ApiModelProperty(value = "诉讼记录", required = true)
    private List<Susong> susongs;
    
    @ApiModelProperty(value = "失信记录", required = true)
    private List<Shixin> shixins;
    
}
