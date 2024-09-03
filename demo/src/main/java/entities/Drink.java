package entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Drink extends Item {
    private String name;

    public Drink(String name, Double price, int calorie, Double litri) {
        super(price, calorie);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", calorie=" + calorie +
                '}';
    }
}
