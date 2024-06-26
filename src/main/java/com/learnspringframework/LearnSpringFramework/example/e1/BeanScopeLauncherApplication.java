package com.learnspringframework.LearnSpringFramework.example.e1;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
class NormalClass{}

@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
@Component
class PrototypeClass{}




@Configuration
@ComponentScan
public class BeanScopeLauncherApplication{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try(var context = 
				new AnnotationConfigApplicationContext
				(BeanScopeLauncherApplication.class)){
			
	
			
			System.out.println(context.getBean(NormalClass.class));
			System.out.println(context.getBean(NormalClass.class));
			 
			
			
			System.out.println(context.getBean(PrototypeClass.class));
			System.out.println(context.getBean(PrototypeClass.class));
			 
	}
	

	}
	


}
