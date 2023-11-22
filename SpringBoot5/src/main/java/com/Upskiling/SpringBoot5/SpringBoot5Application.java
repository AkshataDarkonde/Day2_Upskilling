package com.Upskiling.SpringBoot5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SpringBoot5Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot5Application.class, args);

		final String baseUrl="http://localhost:8080/calculator";

		RestTemplate restTemplate= new RestTemplate();

		double resultAdd = restTemplate.getForObject(baseUrl +"/add?num1={num1}&num2={num2}",Double.class,10,5);
		double resultSubtract    = restTemplate.getForObject(baseUrl +"/subtract?num1={num1}&num2={num2}",Double.class,10,5);
		double resultMultiply = restTemplate.getForObject(baseUrl +"/multiply?num1={num1}&num2={num2}",Double.class,10,5);
		double resultDivide = restTemplate.getForObject(baseUrl +"/divide?num1={num1}&num2={num2}",Double.class,10,5);
		double resultSqrt = restTemplate.getForObject(baseUrl + "/sqrt?num={num}", Double.class,25);

		System.out.println("Addition : " + resultAdd);
		System.out.println("Subtraction : "+ resultSubtract);
		System.out.println("Multiplication : " + resultMultiply);
		System.out.println("Division : "+ resultDivide);
		System.out.println("Square Root : "+ resultSqrt);
	}

}
