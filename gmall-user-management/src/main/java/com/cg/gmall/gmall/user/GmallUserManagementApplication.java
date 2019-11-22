package com.cg.gmall.gmall.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@MapperScan(basePackages = "com.cg.gmall.gmall.user.mapper")
@SpringBootApplication
public class GmallUserManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(GmallUserManagementApplication.class, args);
	}

}
