package com.privalia.presentation.anotations3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfiguration {

	@Bean(name = "helloWorld")
	public HelloWorld helloWorld() {
		return new HelloWorld();
		
	}

}
