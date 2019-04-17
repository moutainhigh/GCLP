package com.grape.controller.request;

import java.util.List;

import org.hibernate.validator.constraints.Length;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import io.swagger.annotations.ApiModelProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"}, ignoreUnknown = true)
public class PersonRequest extends RestfulRequest{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Length(max=8,min=0,message="用户编号不能超出8位")
    @ApiModelProperty(value = "用户编号", example = "", dataType="varchar(8)", required = true )
    private String workerid;

    @Length(max=80,min=0,message="用户名称不能超出80位")
    @ApiModelProperty(value = "用户名称", example = "", dataType="varchar(80)", required = true )
    private String workername;

    @Length(max=32,min=0,message="身份证号码不能超出32位")
    @ApiModelProperty(value = "身份证号码", example = "", dataType="varchar(32)", required = true )
    private String cerdid;

    @Length(max=80,min=0,message="密码不能超出80位")
    @ApiModelProperty(value = "密码", example = "", dataType="varchar(80)", required = true )
    private String password;
    
    @Length(max=80,min=0,message="密码不能超出80位")
    @ApiModelProperty(value = "确认密码", example = "", dataType="varchar(80)", required = true )
    private String confpassword;

    @Length(max=6,min=0,message="所属部门不能超出6位")
    @ApiModelProperty(value = "所属部门", example = "", dataType="varchar(6)", required = true )
    private String department;

    @Length(max=4,min=0,message="状态不能超出4位")
    @ApiModelProperty(value = "状态", example = "", dataType="varchar(4)", required = true )
    private String state;

    @Length(max=6,min=0,message="所属机构不能超出6位")
    @ApiModelProperty(value = "所属机构", example = "", dataType="varchar(6)", required = true )
    private String organizationid;

    @Length(max=20,min=0,message="电话号码不能超出20位")
    @ApiModelProperty(value = "电话号码", example = "", dataType="varchar(20)", required = true )
    private String telnumber;

    @Length(max=11,min=0,message="手机号码不能超出11位")
    @ApiModelProperty(value = "手机号码", example = "", dataType="varchar(11)", required = true )
    private String mobilephone;

    @Length(max=80,min=0,message="不能超出80位")
    @ApiModelProperty(value = "", example = "", dataType="varchar(80)", required = true )
    private String email;

    @Length(max=80,min=0,message="不能超出80位")
    @ApiModelProperty(value = "", example = "", dataType="varchar(80)", required = true )
    private String city;

    @Length(max=8,min=0,message="直属上司不能超出8位")
    @ApiModelProperty(value = "直属上司", example = "", dataType="varchar(8)", required = true )
    private String supervisor;

    @Length(max=4,min=0,message="级别不能超出4位")
    @ApiModelProperty(value = "级别", example = "", dataType="varchar(4)", required = true )
    private String level;

    @Length(max=80,min=0,message="外呼系统邮箱不能超出80位")
    @ApiModelProperty(value = "外呼系统邮箱", example = "", dataType="varchar(80)", required = true )
    private String waihuemail;
    
    @ApiModelProperty(value = "角色", example = "", dataType="varchar(80)", required = true )
    private List<String> job;
}
