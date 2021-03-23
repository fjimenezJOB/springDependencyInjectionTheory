package com.privalia.aspectos.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Principal {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationContext = new AnnotationConfigApplicationContext();
        annotationContext.scan("com.privalia.aspectos.annotations");
        annotationContext.refresh();

        Compra cp = annotationContext.getBean(Compra.class);

        try {
            System.out.println("Invocamos sin problemos");
            cp.compra(false);
            System.out.println("Invocamos para que se produzca un error");
            cp.compra(true);

        } catch (Exception e) {
            System.out.println("Obtenemos la exception: " + e);
        }
        annotationContext.close();
    }
}
