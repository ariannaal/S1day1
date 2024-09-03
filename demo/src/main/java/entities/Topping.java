package entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter

public class Topping extends Item {
    private String name;

    public Topping(String name, Double price, int calorie) {
        super(price, calorie);
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
                ", price=" + price +
                ", calorie=" + calorie +
                '}';
    }
}
