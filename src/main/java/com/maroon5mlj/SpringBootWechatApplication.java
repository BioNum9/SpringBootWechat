package com.maroon5mlj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringBootWechatApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWechatApplication.class, args);
	}
}
