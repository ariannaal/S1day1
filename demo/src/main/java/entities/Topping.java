package entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


public class Topping extends Item {
    private String name;

    public Topping(String name, int calories, double price) {
        super(calories, price);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Topping{" +
                "name='" + name + '\'' +
                ", calories=" + calories +
                ", price=" + price +
                '}';
    }
}