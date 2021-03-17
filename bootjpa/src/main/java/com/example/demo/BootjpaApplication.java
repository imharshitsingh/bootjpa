package com.example.demo;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.controller.PersonController;



@SpringBootApplication
public class BootjpaApplication {

	@Autowired
	private PersonController pc;
	public static void main(String[] args) {
		SpringApplication.run(BootjpaApplication.class, args);
	}


}
