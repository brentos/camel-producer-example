package com.example.camelproducer;

import org.apache.camel.Produce;

public class PersonService {

	@Produce(uri="direct:exportPerson")
	private PersonListener personListener;
	
	public void exportPerson(Person person) {
		personListener.exportPerson(person);
	}
}
