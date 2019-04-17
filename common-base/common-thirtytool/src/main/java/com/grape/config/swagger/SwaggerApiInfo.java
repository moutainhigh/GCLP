package com.grape.config.swagger;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import springfox.documentation.service.ResponseMessage;

import java.util.List;

@Getter
@Builder
@ToString(callSuper = true)
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"}, ignoreUnknown = true)
@SuppressWarnings("unused")
public class SwaggerApiInfo {

	private String title;
    private String version;
    private String serviceUrl;
    private List<ResponseMessage> statusList;

}
