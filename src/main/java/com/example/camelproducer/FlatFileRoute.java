package com.example.camelproducer;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.BindyDataFormat;
import org.apache.camel.model.dataformat.BindyType;
import org.springframework.stereotype.Component;

@Component
public class FlatFileRoute extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		
        BindyDataFormat bindy = new BindyDataFormat();
        bindy.setLocale("en");
        bindy.setClassType(Person.class);
        bindy.setType(BindyType.Csv);
		
		from("direct:exportPerson")
		.routeId("flatFileRoute")
		.marshal(bindy)
		.to("log:com.example?level=INFO");
	}

}
