package entities;

import enums.StatoTavolo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class PizzaConfig {

    @Bean(name = "toppings_tomato")
    public Topping toppingTomatoBean() {
        return new Topping("Tomato", 1.0, 10);
    }

    @Bean(name = "toppings_cheese")
    public Topping toppingCheeseBean() {
        return new Topping("Cheese", 0.69, 92);
    }

    @Bean(name = "toppings_ham")
    public Topping toppingHamBean() {
        return new Topping("Ham", 0.99, 35);
    }

    @Bean(name = "toppings_pineapple")
    public Topping toppingPineappleBean() {
        return new Topping("Pineapple", 0.79, 24);
    }

    @Bean(name = "toppings_salami")
    public Topping toppingSalamiBean() {
        return new Topping("Salami", 0.99, 86);
    }

    @Bean(name = "pizza_margherita")
    public Pizza pizzaMargheritaBean() {
        List<Topping> tList = new ArrayList<>();
        tList.add(toppingTomatoBean());
        tList.add(toppingCheeseBean());
        return new Pizza("Pizza Margherita", 6, 200);
    }

    @Bean(name = "hawaiian_pizza")
    public Pizza pizzaHawaiianBean() {
        List<Topping> tList = new ArrayList<>();
        tList.add(toppingTomatoBean());
        tList.add(toppingCheeseBean());
        tList.add(toppingHamBean());
        tList.add(toppingPineappleBean());
        return new Pizza("Hawaiian Pizza", 10, 300);
    }

    @Bean(name = "salami_pizza")
    public Pizza pizzaSalamiBean() {
        List<Topping> tList = new ArrayList<>();
        tList.add(toppingTomatoBean());
        tList.add(toppingCheeseBean());
        tList.add(toppingSalamiBean());
        return new Pizza("Salami Pizza", 8, 400);
    }


    @Bean
    public Drink limonata () {
        return new Drink("Limonata", 3.0, 100, 0.4);
    }

    @Bean
    public Drink acqua () {
        return new Drink("Acqua", 1.0, 0, 0.5);
    }

    @Bean
    public Drink cola () {
        return new Drink("Cola", 2.5, 200, 0.33);
    }

    @Bean
    public Menu menu() {
        Menu menu = new Menu();
        menu.addElemento(pizzaMargheritaBean());
        menu.addElemento(pizzaHawaiianBean());
        menu.addElemento(pizzaSalamiBean());
        menu.addElemento(limonata());
        menu.addElemento(cola());
        menu.addElemento(acqua());
        return menu;
    }

    // ben per tavoli
    @Bean
    public Table tavolox6() {
        return new Table(1, 6, StatoTavolo.LIBERO);
    }

    @Bean
    public Table tavolox2() {
        return new Table(1, 2, StatoTavolo.LIBERO);
    }

    @Bean
    public Table tavolox4() {
        return new Table(1, 4, StatoTavolo.LIBERO);
    }
}
