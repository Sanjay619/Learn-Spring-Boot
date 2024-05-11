package com.learnspringframework.LearnSpringFramework.example.a0;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;








@Configuration
@ComponentScan
public class SimpleContextLauncherApplication{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try(var context = 
				new AnnotationConfigApplicationContext
				(SimpleContextLauncherApplication.class)){
			
			Arrays.stream(context.getBeanDefinitionNames()).forEach(
					System.out::println);
			
			 
			 
	}
	

	}
	


}
