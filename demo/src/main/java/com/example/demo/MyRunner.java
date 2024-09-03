package com.example.demo;

import entities.Item;
import entities.Menu;
import entities.Order;
import entities.Table;
import enums.StatoOrdine;
import enums.StatoTavolo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
public class MyRunner implements CommandLineRunner {
    //qui ci vanno i componenti da richiamare

    private static final Logger logger = LoggerFactory.getLogger(MyRunner.class);

    @Autowired
    private Menu menu;

    @Autowired
    private Table tavolox2;

    @Override
    public void run(String... args) throws Exception {
        logger.info("Inizio run");

        // stampo il menu
        menu.stampaMenu();

        // creo un ordine
        Order ordine = new Order(1, tavolox2, StatoOrdine.IN_CORSO, 2, LocalDateTime.now());
        ordine.addElementoComanda(menu.getElementiMenu().get(0));
        ordine.addElementoComanda(menu.getElementiMenu().get(0));

        // stasmpo l'ordine
        System.out.println(ordine);

        logger.info("Fine run");
    }
}