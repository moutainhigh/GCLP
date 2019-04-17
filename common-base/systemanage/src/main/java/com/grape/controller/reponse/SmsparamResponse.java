package com.grape.controller.reponse;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.grape.model.db.Smsparam;

import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"}, ignoreUnknown = true)
public class SmsparamResponse extends RestfulResponse{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@ApiModelProperty(value="短信模板列表")
	List<Smsparam> smsparams ;
    
    @ApiModelProperty(value="页数")
    private Integer pagenum;
    
    @ApiModelProperty(value="总条数")
    private Integer total;
}
