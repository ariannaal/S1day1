package com.example.demo;

import entities.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class S1D1ApplicationTests {

	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PizzaConfig.class);

	@Test
	void contextLoads() {
	}

	@BeforeAll
	static void initialSetup(){
		System.out.println("BEFOREALL"); // 'setup iniziale' per i test
	}

	@Test
	void testDrink(){
		Drink lemonade = new Drink ("Lemonade", 128, 1.5);
		assertEquals("Lemonade", lemonade.getName());
		assertEquals(128, lemonade.getCalories());
		assertEquals(1.5, lemonade.getPrice());
	}

@Test
	void testTroppiCoperti(){
		Table table = new Table(1, 10, true, 2.50);
	    assertNotEquals(12, table.getNumMaxCoperti());
}

@Test
void testCoperto() {
		double costoCoperto = context.getBean("costo_coperto", Double.class);
		assertEquals(2.00, costoCoperto);
}

@Test
void testPizzaMargherita(){

		Pizza pizzaMargherita = context.getBean("pizza_margherita", Pizza.class);
	Topping tomato = context.getBean("toppings_tomato", Topping.class);
	Topping cheese = context.getBean("toppings_cheese", Topping.class);

		assertTrue((pizzaMargherita.getToppingList().contains(tomato)));
		assertTrue(pizzaMargherita.getToppingList().contains(cheese));
}

	@ParameterizedTest
	@ValueSource(strings = {"H"})
	void findByPizzaStartingWithH(String letter) {

	List<Pizza> pizzas = new ArrayList<>();
		Pizza pizza = new Pizza("Hawaian Pizza", new ArrayList<>(), false);
		Pizza pizza2 = new Pizza("Salami Pizza", new ArrayList<>(), false);
		pizzas.add(pizza);
		pizzas.add(pizza2);
		long result = pizzas.stream().filter(m -> m.getName().startsWith(letter)).count();
		assertEquals(result, 1);
}


}
