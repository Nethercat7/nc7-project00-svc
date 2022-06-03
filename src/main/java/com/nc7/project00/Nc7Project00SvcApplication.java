package com.nc7.project00;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.nc7.project00.mapper")
public class Nc7Project00SvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(Nc7Project00SvcApplication.class, args);
	}

}
