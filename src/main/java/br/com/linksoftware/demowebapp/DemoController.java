package br.com.linksoftware.demowebapp;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class DemoController {
	
	@GetMapping("person/{id}")
	public Person getPerson(@PathVariable Long id) {
		return new Person("Person " + id, "51 9 9101 1255 - " + new Date().toString());
	}
	
	@GetMapping("person")
	public Person getPerson() {
		return new Person("Fabio", "51 9 9101 1255");
	}
	
	@GetMapping("person2")
	public Person getPerson2() {
		return new Person("Fabio 2", "51 9 9101 1255");
	}	

}
