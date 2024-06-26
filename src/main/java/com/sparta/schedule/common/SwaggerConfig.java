package com.sparta.schedule.common;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@EnableScheduling
public class SwaggerConfig {
    @Bean
    public Docket allApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("USER")
                .useDefaultResponseMessages(false)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
//                .apiInfo(commonInfo());
    }
}
