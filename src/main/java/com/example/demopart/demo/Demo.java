package com.example.demopart.demo;

import com.cts.product.config.AppConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.logging.Logger;
@Configuration
public class Demo {
    @Autowired
    private MyConfiguration myConfiguration;
    private static final Logger logger = Logger.getLogger(Demo.class.getName());

    public DataSource getAppConfig() {
        return myConfiguration.appConfig().getDataSource();
    }
    @Bean
    public void test(){
        System.out.println(getAppConfig());
        logger.info("test : ");
    }


}
