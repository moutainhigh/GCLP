package com.grape.controller.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"}, ignoreUnknown = true)
public class SendBackRequest extends RestfulRequest{

	/**
	 *
			 */
	private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "", example = "", required = true)
	private String nodeid;

    @ApiModelProperty(value = "", example = "", required = true)
    private String productno;
    
    @ApiModelProperty(value = "", example = "", required = true)
    private String workid;
}
