package com.privalia.presentation.anotations2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "helloWorld")
public class HelloWorld {
    
    private String hello;

    public HelloWorld() {
    }

    public String getHello() {
        return hello;
    }

    @Autowired
    @Value("Hello World From Anotations")
    public void setHello(String hello) {
        this.hello = hello;
    }

}
