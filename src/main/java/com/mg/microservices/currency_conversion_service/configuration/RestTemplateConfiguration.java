package com.mg.microservices.currency_conversion_service.configuration;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Mehrdad Ghaderi, S&M
 * Date: 8/13/2025
 * Time: 9:04 PM
 *
 * RestTemplateConfiguration enables zipkin to trace the calls through RestTemplates
 */


@Configuration(proxyBeanMethods = false)
public class RestTemplateConfiguration {

    @Bean
    RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }
}
