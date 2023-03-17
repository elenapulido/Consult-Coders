package com.ConsultCRUD.Consult.Coders;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ConsultCodersApplication {
	public static void main(String[] args) {
		SpringApplication.run(ConsultCodersApplication.class, args);
	}
<<<<<<< HEAD

=======
	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
	
		return String.format("Hello Ibias and everybody!", name);

	}
>>>>>>> 26b84b9158a027027ca2bbe9470b34599e3e57e1
}
