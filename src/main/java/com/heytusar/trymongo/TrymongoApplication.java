package com.heytusar.trymongo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages = "com.heytusar.trymongo.repository")
public class TrymongoApplication {
	public static void main(String[] args) {
		SpringApplication.run(TrymongoApplication.class, args);
	}
}
