package com.czf.gmall.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.czf.gmall.demo.mapper")
public class GmallDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(GmallDemoApplication.class, args);
    }

}
