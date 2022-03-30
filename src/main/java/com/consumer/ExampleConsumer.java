package com.consumer;

import javax.enterprise.context.ApplicationScoped;

import org.eclipse.microprofile.reactive.messaging.Incoming;
import org.jboss.logging.Logger;

import io.smallrye.reactive.messaging.kafka.Record;

@ApplicationScoped
public class ExampleConsumer {

	private final Logger logger = Logger.getLogger(ExampleConsumer.class);

	@Incoming("example-in")
	public void receive(Record<Integer, String> record) {
	}

}
