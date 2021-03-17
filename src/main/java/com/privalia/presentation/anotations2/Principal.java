package com.privalia.presentation.anotations2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Principal {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        context.scan("com.privalia.presentation.anotations2");
        context.refresh();

        HelloWorld helloWorld = context.getBean(HelloWorld.class);
        System.out.println(helloWorld.getHello());

        context.close();
    }
    
}
