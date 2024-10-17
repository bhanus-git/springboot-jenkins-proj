package com.example.springboot_jenkins_proj;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootJenkinsProjApplication {

	public static Logger  logger = LoggerFactory.getLogger(SpringbootJenkinsProjApplication.class);

	@PostConstruct
	public void init()
	{
		System.out.println("Application started....");
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootJenkinsProjApplication.class, args);
		logger.info("Application executed...");
	}

}
