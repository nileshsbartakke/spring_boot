package com.im28minute.rest.webservice.restfulwebservice.helloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

//Controller
@RestController
public class HelloWorldController {
	
	//GET
	//URI -/hello-world
	//method -"Hello World"
	@GetMapping(path="hello-world")
	public String helloworld() {
		return "Hello World";
	}
	
	
	//method -"Hello World"bean 
	@GetMapping(path="hello-world-bean")
	public HelloWorldBean helloworldbean() {
		return new HelloWorldBean("Hello World");
	}

	
	///hello-world-bean/path-variable/in28minute
		@GetMapping(path="hello-world/path-variable/{name}")
		public HelloWorldBean helloworldPathvariable(@PathVariable String name) {
			return new HelloWorldBean(String.format("Hello World,%s",name));
		}

}
