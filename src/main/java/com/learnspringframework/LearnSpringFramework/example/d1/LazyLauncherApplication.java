package com.learnspringframework.LearnSpringFramework.example.d1;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;






@Component
class ClassA{
	
}


@Component
@Lazy
class ClassB{
	
	private ClassA classA;
	
	public void init (ClassA classA) {
		System.out.println("Initialize something..");
		this.classA = classA;
	}
}


@Configuration
@ComponentScan
public class LazyLauncherApplication{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try(var context = 
				new AnnotationConfigApplicationContext
				(LazyLauncherApplication.class)){
			
			Arrays.stream(context.getBeanDefinitionNames()).forEach(
					System.out::println);
			
			context.getBean(ClassB.class).init(new ClassA());
			
			 
			 
	}
	

	}
	


}
