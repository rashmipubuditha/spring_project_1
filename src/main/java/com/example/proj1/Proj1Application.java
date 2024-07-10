package com.example.proj1;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Proj1Application {

	public static void main(String[] args) {
		SpringApplication.run(Proj1Application.class, args);
	}

	@Bean // inject model mapper
	public ModelMapper modelMapper(){
		return new ModelMapper();
	}	

}
