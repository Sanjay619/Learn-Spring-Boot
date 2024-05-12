package com.learnspringframework.LearnSpringHelloWorld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.bind.Name;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age, AddressLine address) {};
record AddressLine(String firstLine, String city) {};

@Configuration
public class HelloWorldConfiguration {

	@Bean
	public String name() {
		return "Sanjay";
	}
	
	@Bean
	public int age() {
		return 35;
	}
	@Bean
	public Person Person() {
		return new Person("Ravi", 20, new AddressLine("Sadar", "karachi"));
	}
	
	
	@Bean
	public Person Person3 (String name , int age, @Qualifier("addressQuilifier") AddressLine address) {
		return new Person(name, age, address);
	}

	
	@Bean(name =  "address2")
	public AddressLine address2() {
		return new AddressLine("korangi crossing", "Karachi");
	}
	
	@Bean
	@Qualifier("addressQuilifier")
	public AddressLine address() {
		return new AddressLine("DHA", "Karachi");
	}
}
	
	
