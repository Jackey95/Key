package com.example.mybatis1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("com.example.mybatis1")
public class ResponseentityApplication {

    public static void main(String[] args) {
        SpringApplication.run(ResponseentityApplication.class, args);
    }

}
