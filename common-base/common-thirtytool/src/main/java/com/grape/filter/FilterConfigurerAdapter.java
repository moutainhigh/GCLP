package com.grape.filter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class FilterConfigurerAdapter extends WebMvcConfigurerAdapter  {

	 @Bean  
	    public CorsFilter corsFilter() {  
	        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();  
	        CorsConfiguration config = new CorsConfiguration();  
	        config.setAllowCredentials(true);  
	        config.addAllowedOrigin(CorsConfiguration.ALL);  
	        config.addAllowedHeader(CorsConfiguration.ALL);  
	        config.addAllowedMethod(CorsConfiguration.ALL);  
	        source.registerCorsConfiguration("/**", config);  
	        return new CorsFilter(source);
	    } 
	
		@Override
		public void addResourceHandlers(ResourceHandlerRegistry registry) {
		    registry.addResourceHandler("swagger-ui.html")
		      .addResourceLocations("classpath:/META-INF/resources/");

		    registry.addResourceHandler("/webjars/**")
		      .addResourceLocations("classpath:/META-INF/resources/webjars/");
		}
	
	 /**
	 * 只增加CorsMapping是无法解决PFlight Request的,Spring会默认调到失败页面，需要添加Config配置
	 */
	@Override
	public void addCorsMappings(CorsRegistry registry) {	
		registry.addMapping("/**")
		.allowedHeaders("*")
		.allowedMethods("*")
		.allowedOrigins("*")
		.allowCredentials(true);
    }
	
}
