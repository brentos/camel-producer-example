package com.example.camelproducer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CamelProducerApplicationTests {

	@Autowired
	PersonService personService;
	
	@Test
	public void contextLoads() {
	}
	
	@Test
	public void testFlatFileRoute() {
		Person person = new Person();
		person.setFirstName("Sammy");
		person.setLastName("Jankis");
		person.setSsn("123-45-6789");

		personService.exportPerson(person);
	}

}
