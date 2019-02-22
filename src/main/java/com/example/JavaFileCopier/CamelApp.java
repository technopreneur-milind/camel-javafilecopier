package com.example.JavaFileCopier;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;

public class CamelApp {
	public static void main(String[] args) throws Exception {
		CamelContext context = new DefaultCamelContext();
		 context.addRoutes(new RouteBuilder() {
		 public void configure() {
		 from("file:F:/camel/data/inbox?noop=true")
		 .to("file:F:/camel/data/outbox");
		 }
		 });
		 context.start();
		 Thread.sleep(10000);
		 context.stop();
	}

}
