package com.grape.controller.reponse;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.grape.controller.bean.ImageBean1;
import com.grape.controller.request.ImageBean;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"}, ignoreUnknown = true)
public class ImagenameResponse extends RestfulResponse{

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value="",example="",required=true,dataType="")
    private List<ImageBean> imageNamelist ;
}
