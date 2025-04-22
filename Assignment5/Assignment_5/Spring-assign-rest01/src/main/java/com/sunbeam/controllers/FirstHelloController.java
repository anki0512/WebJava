package com.sunbeam.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FirstHelloController {
@GetMapping("/v1/hello")
public @ResponseBody String sayHello(){
	return "Hello DMC";
}
@GetMapping("/v1/hi")
		public @ResponseBody String sayHi() {
	return "hii DMC";
}
@GetMapping("/v1/bye")
public @ResponseBody String sayBye()
{
	return "Bye Dmc";
}
@GetMapping("/v1/www")
    public @ResponseBody String wave() {
    return "waving DMC";

}
}
