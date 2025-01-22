package com.rahul.springboot.crud.springbootcrudapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.rahul.springboot.crud.springbootcrudapi.dao")
public class SpringbootCrudApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootCrudApiApplication.class, args);
	}

}
