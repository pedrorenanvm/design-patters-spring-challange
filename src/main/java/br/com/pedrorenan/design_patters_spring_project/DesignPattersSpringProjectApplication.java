package br.com.pedrorenan.design_patters_spring_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class DesignPattersSpringProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesignPattersSpringProjectApplication.class, args);
	}

}
