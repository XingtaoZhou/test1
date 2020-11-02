package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import tk.mybatis.spring.annotation.MapperScan;


@MapperScan("com.example.mapper")
@EntityScan(basePackages = {"com.example.entity"})
@SpringBootApplication
public class TkmybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(TkmybatisApplication.class, args);
    }

}
