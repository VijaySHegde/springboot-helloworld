package com.gazgeek.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
public class Application extends ServletInitializer{


    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }


}
