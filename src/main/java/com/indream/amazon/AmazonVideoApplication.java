package com.indream.amazon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.indream.amazon.configuration.MultipleMongoDBManager;

@EnableConfigurationProperties(MultipleMongoDBManager.class)
@SpringBootApplication
public class AmazonVideoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AmazonVideoApplication.class, args);
	}

}

