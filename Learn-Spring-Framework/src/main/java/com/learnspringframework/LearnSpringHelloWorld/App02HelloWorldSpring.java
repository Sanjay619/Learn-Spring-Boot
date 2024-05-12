package com.learnspringframework.LearnSpringHelloWorld;



import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		
		System.out.println(context.getBean("name"));
		
		System.out.println(context.getBean("age"));
		
		System.out.println(context.getBean("Person"));
		
		//System.out.println(context.getBean("Address"));
		
		System.out.println(context.getBean("address2"));
		System.out.println(context.getBean("Person3"));
		//System.out.println(context.getBean(AddressLine.class));
		Arrays.stream(context.getBeanDefinitionNames()).forEach(
				System.out::println);
		
	}

}
