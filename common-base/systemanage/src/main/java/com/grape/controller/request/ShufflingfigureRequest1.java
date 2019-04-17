package com.grape.controller.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.grape.model.db.Shufflingfigure;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import org.hibernate.validator.constraints.Length;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"}, ignoreUnknown = true)
public class ShufflingfigureRequest1 extends RestfulRequest{
    @Length(max=19,min=0,message="不能超出19位")
    @ApiModelProperty(value = "", example = "", dataType="varchar(19)", required = true )
    private String id;

    @Length(max=80,min=0,message="影像名称不能超出80位")
    @ApiModelProperty(value = "影像名称", example = "", dataType="varchar(80)", required = true )
    private String filename;

    @Length(max=100,min=0,message="影像url不能超出100位")
    @ApiModelProperty(value = "影像url", example = "", dataType="varchar(100)", required = true )
    private String fileurl;

    @Length(max=20,min=0,message="产品编号不能超出20位")
    @ApiModelProperty(value = "产品编号", example = "", dataType="varchar(20)", required = true )
    private String productno;

    @Length(max=255,min=0,message="产品名称不能超出255位")
    @ApiModelProperty(value = "产品名称", example = "", dataType="varchar(255)", required = true )
    private String productname;

    @Length(max=1,min=0,message="启用标志不能超出1位")
    @ApiModelProperty(value = "启用标志", example = "", dataType="varchar(1)", required = true )
    private String useflg;

    @Length(max=10,min=0,message="轮播图片类型不能超出10位")
    @ApiModelProperty(value = "轮播图片类型", example = "", dataType="varchar(10)", required = true )
    private String type;

    @ApiModelProperty(value = "最后修改时间", example = "", dataType="datetime", required = true )
    private Date chgdt;

    @Length(max=8,min=0,message="最后修改人不能超出8位")
    @ApiModelProperty(value = "最后修改人", example = "", dataType="varchar(8)", required = true )
    private String chgtl;

    @Length(max=255,min=0,message="描述信息不能超出255位")
    @ApiModelProperty(value = "描述信息", example = "", dataType="varchar(255)", required = true )
    private String description;
}
