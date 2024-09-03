package entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter

public class Topping extends Item {
    private String name;

    public Topping(String name, int calories, double price) {
        super(calories, price);
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
