package entities;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Pizza extends Item {
    private String name;
    private List<Topping> toppings;

    public Pizza(String name, double prezzo, int calorie) {
        super(prezzo, calorie);
        this.name = name;
        this.toppings = new ArrayList<>();
    }

    public void addTopping(Topping topping) {
        toppings.add(topping);
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", toppings=" + toppings +
                ", price=" + price +
                ", calorie=" + calorie +
                '}';
    }
}

