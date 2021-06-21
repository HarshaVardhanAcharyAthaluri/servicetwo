package com.task.servicetwo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {

	private static final Logger log = LoggerFactory.getLogger(GreetController.class);
	@GetMapping("/hello")
	public ResponseEntity<String> greet(){
		log.info("{}","/hello");
		return new ResponseEntity<String>("Hello ", HttpStatus.OK);
	}
}
