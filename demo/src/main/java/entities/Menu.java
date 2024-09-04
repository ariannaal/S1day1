package entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Menu {
    private List<Pizza> pizzaList;
    private List<Drink> drinkList;
    private List<Topping> toppingList;

    public Menu(List<Pizza> pizzaList, List<Drink> drinkList, List<Topping> toppingList) {
        this.pizzaList = pizzaList;
        this.drinkList = drinkList;
        this.toppingList = toppingList;
    }

    public List<Pizza> getPizzaList() {
        return pizzaList;
    }

    public void setPizzaList(List<Pizza> pizzaList) {
        this.pizzaList = pizzaList;
    }

    public List<Drink> getDrinkList() {
        return drinkList;
    }

    public void setDrinkList(List<Drink> drinkList) {
        this.drinkList = drinkList;
    }

    public List<Topping> getToppingList() {
        return toppingList;
    }

    public void setToppingList(List<Topping> toppingList) {
        this.toppingList = toppingList;
    }

    // metodo per stampare l'intero menu
    public void printMenu() {
        System.out.println("******* Menu *******");
        System.out.println("PIZZAS");
        this.pizzaList.forEach(System.out::println);
        System.out.println();

        System.out.println("TOPPINGS");
        this.toppingList.forEach(System.out::println);
        System.out.println();

        System.out.println("DRINKS");
        this.drinkList.forEach(System.out::println);
        System.out.println();

    }

    @Override
    public String toString() {
        return "Menu{" +
                "pizzaList=" + pizzaList +
                ", drinkList=" + drinkList +
                ", toppingList=" + toppingList +
                '}';
    }
}

