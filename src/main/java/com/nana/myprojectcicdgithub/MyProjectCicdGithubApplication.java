package com.nana.myprojectcicdgithub;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class MyProjectCicdGithubApplication {

	public static void main(String[] args) {

		SpringApplication.run(MyProjectCicdGithubApplication.class, args);
	}

	@PostConstruct
	public void init()
	{
		Logger log = LoggerFactory.getLogger(MyProjectCicdGithubApplication.class);
		log.info("Java app started");
	}

	public String getStatus() {
		return "OK";
	}

}
