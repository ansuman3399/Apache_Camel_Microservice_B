package com.apache.CamelB.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;
@Component
public class ActiveMqReceiverRoute extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("activemq:my-activemq-queue")
		.log("${body}");
	}

}
