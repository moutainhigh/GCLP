package com.grape.controller.response.bean;

import java.util.List;



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
@ToString(callSuper = true)

public class PhoneVirification {
	
	   
    @ApiModelProperty(value = "通话记录信息", required = true)
    private List<WaihuCalllog>  calllogs;
    
    @ApiModelProperty(value = "电话核实意见", required = true)
    private String notation;
    
}
