package com.example.demopart.demo;

import com.cts.product.config.AppConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:/com/cts/product/config/AppConfig.class")
public class MyConfiguration {

    @Bean
    public AppConfig appConfig() {
        return new AppConfig();
    }

}