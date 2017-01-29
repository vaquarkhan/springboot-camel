package com.javainuse;


import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;
 
@Component
public class MyRoute extends RouteBuilder {
 
    @Override
    public void configure() throws Exception {
    	from("file:C://temp//inputFolder?noop=true").to("file:C://temp//outputFolder");
    }
}
