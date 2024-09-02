package com.example.demo;
import entities.Menu;
import entities.PizzaConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class S1D1Application {

	public static void main(String[] args) {
		SpringApplication.run(S1D1Application.class, args);


		ApplicationContext context = new AnnotationConfigApplicationContext(PizzaConfig.class);

		Menu menu = context.getBean(Menu.class);
		System.out.println(menu);

	}
}
