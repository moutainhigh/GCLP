package com.grape.controller.bean;

import java.util.Date;

import org.hibernate.validator.constraints.Length;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ImageBean1{
	@Length(max=19,min=0,message="主键ID不能超出19位")
	@ApiModelProperty(value = "文件类型名称", example = "", dataType="varchar(19)", required = true )
    private String filename;
	
	@Length(max=19,min=0,message="主键ID不能超出19位")
	@ApiModelProperty(value = "文件类型", example = "", dataType="varchar(19)", required = true )
    private String filetype;
	
	@Length(max=19,min=0,message="主键ID不能超出19位")
	@ApiModelProperty(value = "主键ID", example = "", dataType="varchar(19)", required = true )
    private String imageid;

	@Length(max=4,min=0,message="影像类型不能超出4位")
	@ApiModelProperty(value = "影像类型", example = "", dataType="varchar(4)", required = true )
    private String imagetype;

	@Length(max=120,min=0,message="影像名称不能超出120位")
	@ApiModelProperty(value = "影像名称", example = "", dataType="varchar(120)", required = true )
    private String imagename;

	@Length(max=80,min=0,message="保存跟路径不能超出80位")
	@ApiModelProperty(value = "保存跟路径", example = "", dataType="varchar(80)", required = true )
    private String rootdir;

	@Length(max=240,min=0,message="保存相对路径不能超出240位")
	@ApiModelProperty(value = "保存相对路径", example = "", dataType="varchar(240)", required = true )
    private String absolutedir;

	@Length(max=10,min=0,message="流水号不能超出10位")
	@ApiModelProperty(value = "流水号", example = "", dataType="varchar(10)", required = true )
    private String workid;

	@Length(max=10,min=0,message="保存类型不能超出10位")
	@ApiModelProperty(value = "保存类型", example = "", dataType="varchar(10)", required = true )
    private String savetype;

	@Length(max=200,min=0,message="存放地不能超出200位")
	@ApiModelProperty(value = "存放地", example = "", dataType="varchar(200)", required = true )
    private String saveaddress;

	@Length(max=12,min=0,message="节点编号不能超出12位")
	@ApiModelProperty(value = "节点编号", example = "", dataType="varchar(12)", required = true )
    private String nodeid;

	@ApiModelProperty(value = "操作时间", example = "", dataType="datetime", required = true )
    private Date chgdt;

	@Length(max=8,min=0,message="操作人不能超出8位")
	@ApiModelProperty(value = "操作人", example = "", dataType="varchar(8)", required = true )
    private String chgtl;
	
	@ApiModelProperty(value = "文件大小", example = "", dataType="varchar(8)", required = true )
    private String filesize;
}
