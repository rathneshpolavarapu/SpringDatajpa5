package com.example.demo;


import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.model.Vaccine;
import com.example.demo.service.Vaccineservice;

@SpringBootApplication
public class SpringDataJpa3Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(SpringDataJpa3Application.class, args);
		
		Vaccineservice service=container.getBean(Vaccineservice.class);
		
      service.fetchByCostLessthan(147.8);
      
}

}