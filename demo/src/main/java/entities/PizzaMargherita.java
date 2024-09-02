package entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString

public class PizzaMargherita {

    private String name;
    private double basePrice;
    private List<Topping> toppings;


    public PizzaMargherita(String name, double basePrice) {
        this.name = name;
        this.basePrice = basePrice;
        this.toppings = new ArrayList<>();
    }

    public void addTopping(Topping topping) {
        this.toppings.add(topping);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    public double getTotalPrice() {
        return basePrice + toppings.stream().mapToDouble(Topping::getPrice).sum();
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", basePrice=" + basePrice +
                ", toppings=" + toppings +
                '}';
    }
}
