package com.pw.wispne.iniesta.config;

import com.pw.wispne.iniesta.helloworld.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class MyMvcConfig extends WebMvcConfigurationSupport {

    @Bean
    public HelloService helloService(){
        return new HelloService();
    }
}
