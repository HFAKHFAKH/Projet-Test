package com.example.test;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class HelloController {

	@GetMapping("/affiche")
	public String afficheHello() {
		return " Eclipse!!!";
	}

	@GetMapping("/ping")
	public String ping() {
		return "connection serveur fonctionnelle";
	}
}
