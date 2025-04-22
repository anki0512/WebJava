package com.sunbeam.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Controller
public class SecondHelloController {
 
@GetMapping("/v2/hello/")	
public String sayHello() {
	return "Hellloo guyss";
}

@GetMapping("/v2/Hii/")
 public String sayhii() {
	return "Hiii witches";
}

@GetMapping("/v2/byee?")
public String sayBye() {
	return "byee witches";
}
}

