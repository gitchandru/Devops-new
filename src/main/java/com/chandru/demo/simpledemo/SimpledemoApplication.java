package com.chandru.demo.simpledemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


/*
 * @SpringBootApplication public class SimpledemoApplication {
 * 
 * public static void main(String[] args) {
 * SpringApplication.run(SimpledemoApplication.class, args); }
 * 
 * }
 */
 
 



  // For Generating War file instead of .jar file uncomment below code and  comment above code
  
  
  
  @SpringBootApplication public class SimpledemoApplication extends
  SpringBootServletInitializer {
  
  @Override protected SpringApplicationBuilder
  configure(SpringApplicationBuilder application) { return
  application.sources(SimpledemoApplication.class); }
  
  public static void main(String[] args) {
  SpringApplication.run(SimpledemoApplication.class, args); }
  
  }
 
 
