package com.example.camelproducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CamelProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CamelProducerApplication.class, args);
	}
	
	@Bean
	public PersonService personService()
	{
		return new PersonService();
	}
}
