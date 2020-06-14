package com.sxt.common;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.annotations.ApiOperation;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Swagger {
	
	@Bean
	public Docket swaggerSpring() {
		
		return new Docket(DocumentationType.SWAGGER_2).
				apiInfo(apiInfo())
				.select()
				.apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
				.build();
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().
				description("接口文档")
				.contact(new Contact("雷卫", "123456", "lei_zhy@163.com"))
				.version("1.0")
				.licenseUrl("localhost")
				.license("武汉加油！")
				.build();
	}
}
