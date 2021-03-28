package com.stackroute.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
public class FavouriteFoodsApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(FavouriteFoodsApplication.class, args);
	}

}
