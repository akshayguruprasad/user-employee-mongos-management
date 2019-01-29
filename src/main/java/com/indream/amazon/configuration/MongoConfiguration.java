package com.indream.amazon.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.mongo.MongoProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.mongodb.MongoClient;

@Configuration
public class MongoConfiguration {
	@Autowired
	private MultipleMongoDBManager mongoManager;

	@Bean("mongoEmployeeTemplate")
	public MongoTemplate getEmployeeMongoTemplate() {
		MongoProperties prop = mongoManager.getEmployeeMongoProp();
		return new MongoTemplate(getCustomerMongoClient(prop), prop.getDatabase());
	}

	@Bean
	public MongoClient getEmployeeMongoClient(MongoProperties prop) {
		return new MongoClient(prop.getHost(), prop.getPort());

	}

	@Bean("mongoCustomerTemplate")
	public MongoTemplate getCustomerMongoTemplate() {
		MongoProperties prop = mongoManager.getCustomerMongoProp();
		return new MongoTemplate(getCustomerMongoClient(prop), prop.getDatabase());
	}

	@Bean
	public MongoClient getCustomerMongoClient(MongoProperties prop) {
		return new MongoClient(prop.getHost(), prop.getPort());
	}

}
