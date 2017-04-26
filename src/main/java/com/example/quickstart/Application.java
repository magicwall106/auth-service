package com.example.quickstart;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created on 9/28/16.
 */
@Configuration
@RestController
@EnableAutoConfiguration
@SpringBootApplication
@EnableFeignClients
@SuppressWarnings("PMD")
public class Application {

    @RequestMapping("/")
    public String hello() {
        return "Hello world !!!";
    }

    public static void main(String[] args) {
        new SpringApplicationBuilder(Application.class).web(true).run(args);
    }
}

