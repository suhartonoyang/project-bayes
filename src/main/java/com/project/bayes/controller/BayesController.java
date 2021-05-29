package com.project.bayes.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/bayes")
@CrossOrigin
public class BayesController {

	@GetMapping("/helloWorld")
	public String helloWorld() {
		return "Hello World";
	}
}