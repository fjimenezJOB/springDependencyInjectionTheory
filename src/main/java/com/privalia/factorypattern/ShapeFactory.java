package com.privalia.factorypattern;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ShapeFactory {

    public Shape getShape(String packageName){
        // if (shapeType == null){
        //     return null;
        // }
        // if(shapeType.equalsIgnoreCase("CIRCLE")){
        //     return new Circle();
        // } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
        //     return new Rectangle();
        // } else if(shapeType.equalsIgnoreCase("SQUARE")){
        //     return new Square();
        // }

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        context.scan("com.privalia.presentation.anotations2");
        context.refresh();

        // HelloWorld helloWorld = context.getBean(HelloWorld.class);
        // System.out.println(helloWorld.getHello());

        context.close();
        return null;
    }
}
