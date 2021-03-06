package com.privalia.aspectos.annotations;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@EnableAspectJAutoProxy
@ComponentScan(basePackages = "com.privalia.aspectos.annotations")
@Component
public class Comprar implements Compra {

    public void compra(boolean error) throws Exception {
        if (error) {
            throw new Exception("Ha habido un error en la compra");
        }
        System.out.println("Realizando compra...");
    }

}
