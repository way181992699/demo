package com.star.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//扫描mybatis mapper 包的路径
@MapperScan(basePackages="com.star.demo.mapper")
//扫描所有需要的包，包含一些自用的工具类包 所在的路径
@ComponentScan(basePackages= {"com.star.demo","org.n3r.idworker"})
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
