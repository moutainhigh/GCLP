package com.grape.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.grape.config.swagger.SwaggerApiInfo;
import com.grape.config.swagger.SwaggerTemplate;
import com.grape.controller.bean.StatusCode;

import springfox.documentation.builders.ResponseMessageBuilder;
import springfox.documentation.service.ResponseMessage;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.LinkedList;
import java.util.List;

/**
 * @描述 swagger文档配置类
 * @创建人 zyh
 * @创建时间 2018/11/13 11:05
 */
@EnableSwagger2
@Configuration
public class SwaggerConfiguration extends SwaggerTemplate {

    @Bean
    public SwaggerApiInfo info() {
        return SwaggerApiInfo.builder().title("managerment服务").version("v1").serviceUrl(null).statusList(extractStatusCodes()).build();
    }

    private List<ResponseMessage> extractStatusCodes() {
        final LinkedList<ResponseMessage> list = new LinkedList<>();
        for (StatusCode statusCodes : StatusCode.values()) {
            final ResponseMessageBuilder builder = new ResponseMessageBuilder();
            final ResponseMessage message = builder
                    .code(statusCodes.code())
                    .message(statusCodes.message())
                    .build();
            list.add(message);
        }
        return list;
    }

}
