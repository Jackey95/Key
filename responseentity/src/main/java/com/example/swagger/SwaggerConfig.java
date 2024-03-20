package com.example.swagger;

import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

public class SwaggerConfig {
    @Bean
    public Docket desertsApi() {
        return new Docket(DocumentationType.OAS_30)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.sike.controller"))
                .paths(PathSelectors.any())
                .build()
                .groupName("sike")
                .enable(true);
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("用户管理系统说明API文档")
                .description("用户管理系统说明API文档")
                .contact(new Contact("smith", "https://www.sike.com",
                        "123456@qq.com"))
                .termsOfServiceUrl("https://www.sike.com")
                .version("1.0")
                .build();
    }

}
