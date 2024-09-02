package entities;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PizzaConfig {

    @Bean
    public Topping prosciutto() {
        return new Topping("Prosciutto", 2.0, 35);
    }

    @Bean
    public Topping ananas (){
        return new Topping("Ananas", 1, 24);
    }

    @Bean
    public Topping funghi() {
        return new Topping("Funghi", 1.5, 20);
    }

    @Bean
    public Topping salamePiccante() {
        return new Topping("Salame piccante", 2, 86);
    }

    @Bean
    public Topping patatine() {
        return new Topping("Patatine", 3, 100);
    }


    @Bean
    public Drink cocaCola() {
        return new Drink("Coca Cola", 2.0);
    }

    @Bean
    public Drink acqua() {
        return new Drink("Acqua", 1.0);
    }

    @Bean
    public Drink birra() {
        return new Drink("Birra", 5.0);
    }

    @Bean
    public Topping cipolle() {
        return new Topping("Cipolle", 2, 22);
    }

//    @Bean
//    public PizzaMargherita margheritaPizza() {
//        return new PizzaMargherita();
//    }

    @Bean
    public Pizza hawaiianPizza() {
        Pizza pizza = new Pizza("Pizza hawaina", 9);
        pizza.addTopping(prosciutto());
        pizza.addTopping(ananas());
        pizza.setName("Hawaiian Pizza"); // cosi aggiorna il nome della pizza
        return pizza;
    }

    @Bean
    public Menu menu() {
        Menu menu = new Menu();
//        menu.addPizza(margheritaPizza);
        menu.addPizza(hawaiianPizza());
        menu.addDrink(cocaCola());
        menu.addDrink(acqua());
        return menu;
    }




}
