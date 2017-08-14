package com.copart.e1.examples.java.spring.Nic_RESTful_web_service_using_json;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 
 * The main purpose of the application class is to "bootstrap" the
 * application. "Bootstrapping" means to start a self-sustaining
 * process. A spring-boot application is capable of persisting
 * indefinitely without external input.
 *
 */
 
 @SpringBootApplication
 /**
 * @SpringBootApplication is same as the combination of: 
 *      @Configuration 
 *      @EnableAutoConfiguration 
 *      @ComponentScan
 **/
 
 public class JsonWsApplication 
 {
      public static void main(String[] args) 
      { SpringApplication.run(JsonWsApplication.class, args); }
 }
