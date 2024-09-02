package entities;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    private List<Pizza> pizzas;
    private List<Drink> drinks;

    public Menu() {
        this.pizzas = new ArrayList<>();
        this.drinks = new ArrayList<>();
    }

    public void addPizza(Pizza pizza) {
        this.pizzas.add(pizza);
    }

    public void addDrink(Drink drink) {
        this.drinks.add(drink);
    }

    public List<Pizza> getPizzas() {
        return pizzas;
    }

    public List<Drink> getDrinks() {
        return drinks;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "pizzas=" + pizzas +
                ", drinks=" + drinks +
                '}';
    }
}

