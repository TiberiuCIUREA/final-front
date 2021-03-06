package com.tiberiu.mentool.mentoolfront.infra.configurations;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.client.RestTemplate;

@EnableJpaRepositories(basePackages = AppConfiguration.BASE_PACKAGES)
@ComponentScan(basePackages = AppConfiguration.BASE_PACKAGES)
@Configuration
public class AppConfiguration {
    static final String BASE_PACKAGES = "com.tiberiu.mentool.mentoolfront";

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
