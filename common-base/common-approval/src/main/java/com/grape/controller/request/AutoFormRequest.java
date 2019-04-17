package com.grape.controller.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import org.hibernate.validator.constraints.Length;

@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"}, ignoreUnknown = true)
public class AutoFormRequest  extends RestfulRequest{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Length(max=18,min=0,message="主键ID不能超出18位")
    @ApiModelProperty(value = "主键ID", example = "", dataType="int(18)", required = true )
    private Integer id;

    @Length(max=19,min=0,message="表单编号不能超出19位")
    @ApiModelProperty(value = "表单编号", example = "", dataType="int(19)", required = true )
    private String formid;

    @ApiModelProperty(value = "字段json串", example = "", dataType="json", required = true )
    private Object jsoncolumn;
    
	@ApiModelProperty(value = "表单配置", example = "", dataType="varchar(255)", required = true )
    private Object config;

    @Length(max=2,min=0,message="出处标识不能超出2位")
    @ApiModelProperty(value = "出处标识", example = "", dataType="varchar(2)", required = true )
    private String formflg;
    
    @ApiModelProperty(value = "表单名称", example = "", dataType="varchar(80)", required = true )
    private String formname;

}
