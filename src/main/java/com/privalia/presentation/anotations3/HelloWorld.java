package com.privalia.presentation.anotations3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class HelloWorld {
    @Autowired
    @Value("HelloWorld from Anotations")
    private String hello;

    public HelloWorld() {}
    
    public String getHello() {
        return hello;
    }

    public void getHello(String hello) {
        this.hello = hello;
    }

    public void setHello(String hello) {
        this.hello = hello;
    }
}
