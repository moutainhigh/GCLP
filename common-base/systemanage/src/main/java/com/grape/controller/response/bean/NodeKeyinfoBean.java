package com.grape.controller.response.bean;

import com.grape.model.db.Nodebutton;
import com.grape.model.db.Proctrans;
import com.grape.model.db.Proctrans;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import java.util.List;

@Getter
@Setter
public class NodeKeyinfoBean {
    @ApiModelProperty(value="按键名称")
    private String name;

    @ApiModelProperty(value="按键id")
    private String id;

    @Length(max=20,min=0,message="")
    @ApiModelProperty(value = "", example = "", dataType="varchar(20)", required = true )
    private String nodeid;

    @Length(max=20,min=0,message="按键顺序不能超出20位")
    @ApiModelProperty(value = "按键顺序", example = "", dataType="varchar(20)", required = true )
    private String ordernode;

    @Length(max=19,min=0,message="跳转节点不能超出19位")
    @ApiModelProperty(value = "跳转节点", example = "", dataType="varchar(19)", required = true )
    private String nextnode;

    private List<Proctrans> proctransList ;
}
