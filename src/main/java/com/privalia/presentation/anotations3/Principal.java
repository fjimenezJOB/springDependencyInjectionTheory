package com.privalia.presentation.anotations3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Principal {

	public static void main(String[] args) {

		AbstractApplicationContext appContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);

		HelloWorld helloWorld = (HelloWorld) appContext.getBean("helloWorld");
		HelloWorld helloWorld1 = (HelloWorld) appContext.getBean("helloWorld");
		System.out.println(helloWorld.getHello());
		System.out.println(helloWorld.hashCode());
		System.out.println(helloWorld1.hashCode());

		appContext.close();

	}
}