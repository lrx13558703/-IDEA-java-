package com.test.apitestpro;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.test.apitestpro.domain.mapper")
public class ApiTestProApplication {
    public static void main(String[] args) {
        SpringApplication.run(ApiTestProApplication.class, args);
    }
}
