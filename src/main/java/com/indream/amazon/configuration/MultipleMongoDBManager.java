package com.indream.amazon.configuration;

import org.springframework.boot.autoconfigure.mongo.MongoProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "MongoDB")
public class MultipleMongoDBManager {

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmployeeMongoProp(MongoProperties employeeMongoProp) {
		this.employeeMongoProp = employeeMongoProp;
	}

	public void setCustomerMongoProp(MongoProperties customerMongoProp) {
		this.customerMongoProp = customerMongoProp;
	}

	String name;
	MongoProperties employeeMongoProp, customerMongoProp;

	public MongoProperties getEmployeeMongoProp() {
		return employeeMongoProp;
	}

	public MongoProperties getCustomerMongoProp() {
		return customerMongoProp;
	}

	public MultipleMongoDBManager() {

		employeeMongoProp = new MongoProperties();
		customerMongoProp = new MongoProperties();
	}

}
