package com.txx.rabbit;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.txx.rabbit.mapper")
public class MqRabbitWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(MqRabbitWebApplication.class, args);
    }

}
