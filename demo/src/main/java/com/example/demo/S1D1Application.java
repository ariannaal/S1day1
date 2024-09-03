package com.example.demo;
import entities.Menu;
import entities.Order;
import entities.PizzaConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class S1D1Application {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(PizzaConfig.class);
		Menu menu = context.getBean(Menu.class);
		menu.stampaMenu();

		SpringApplication.run(S1D1Application.class, args);
		Order order = context.getBean(Order.class);
		order.stampaOrdine();

	}
}
