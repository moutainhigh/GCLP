package com.grape.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;

@Component
@Primary
public class SwaggerApiConfig implements SwaggerResourcesProvider {

	@Override
	public List<SwaggerResource> get() {
		List<SwaggerResource> resources = new ArrayList<>();
        resources.add(swaggerResource("approval服务", "/approval/v2/api-docs", "1.0"));
        resources.add(swaggerResource("home服务", "/home/v2/api-docs", "1.0"));
        resources.add(swaggerResource("management服务", "/management/v2/api-docs", "1.0"));
        resources.add(swaggerResource("company服务", "/company/v2/api-docs", "1.0"));
        resources.add(swaggerResource("workflow服务", "/workflow/v2/api-docs", "1.0"));
        resources.add(swaggerResource("sysmanage服务", "/sysmanage/v2/api-docs", "1.0"));
        
        //当前服务名
        //resources.add(swaggerResource("jpa-feign服务", "/jpa-feign/v2/api-docs", "1.0"));
        return resources;
	}

	
    private SwaggerResource swaggerResource(String name, String location, String version) {
        SwaggerResource swaggerResource = new SwaggerResource();
        swaggerResource.setName(name);
        swaggerResource.setLocation(location);
        swaggerResource.setSwaggerVersion(version);
        return swaggerResource;
    }
}
