package com.example.demo;

import entities.Drink;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class S1D1ApplicationTests {

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



}
