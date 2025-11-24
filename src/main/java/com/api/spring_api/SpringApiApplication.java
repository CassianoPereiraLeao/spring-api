package com.api.spring_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/* 
Configurações caso use os outros 3
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
*/

@SpringBootApplication
/*  o spring boot aplication aplica essas 3 modificações 
@Configuration
@EnableAutoConfiguration
@ComponentScan
*/
public class SpringApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringApiApplication.class, args);
	}

}
