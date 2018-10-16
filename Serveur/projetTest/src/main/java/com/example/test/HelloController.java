package com.example.test;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.RetourWS;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class HelloController {

	@GetMapping("/affiche")
	public RetourWS afficheHello() {
		return new RetourWS(" Eclipse!!!");
	}

	@GetMapping("/ping")
	public RetourWS ping() {
		return new RetourWS("connection serveur fonctionnelle");
	}
}
