package com.example.Thymeleaf.Demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

    @SpringBootApplication
    @ComponentScan({"com.example.Thymeleaf.Demo", "com.example.config"})
        public class ThymeleafDemoApplication {

        public static void main(String[] args) {
        SpringApplication.run(ThymeleafDemoApplication.class, args);
    }
}
