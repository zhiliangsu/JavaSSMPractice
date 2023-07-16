package com.hitech;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hitech.dao")
public class Mybatisplus04GeneratorApplication {

	public static void main(String[] args) {
		SpringApplication.run(Mybatisplus04GeneratorApplication.class, args);
	}

}
