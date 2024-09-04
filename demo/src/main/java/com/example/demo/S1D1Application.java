package com.example.demo;
import entities.Menu;
import entities.Order;
import entities.PizzaConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(PizzaConfig.class)
public class S1D1Application {

	public static void main(String[] args) {
			SpringApplication.run(S1D1Application.class, args);

	}
}
