package com.gilcom;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@SpringBootApplication
@ComponentScan(basePackages= {"com.gilcom.controller","com.gilcom.service"})
@EntityScan(basePackages="com.gilcom.entity")
//@EnableJpaRepositories(basePackages="com.gilcom.repository")
public class MyApplication {  
	public static void main(String[] args) {
		SpringApplication.run(MyApplication.class, args);
    }       
}            