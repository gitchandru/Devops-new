package com.chandru.demo.simpledemo.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.chandru.demo.simpledemo.ui.response.ResponseRest;

@RestController
@RequestMapping("/demo")
public class HelloController {
	private final AtomicLong counter = new AtomicLong();
	private static final String msg="Hi Welcome %s";
	
	@GetMapping
	public String getHelloMessage() {
		
		return "HI Welcome to Demo";
	}
	
	
	@GetMapping(path="/hello", produces={MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public ResponseRest greetUserWithMessage(@RequestParam(value="name", defaultValue="Demo") String name) {
		
		
		return new ResponseRest(counter.incrementAndGet(),String.format(msg, name));
	}


}