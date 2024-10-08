package entities;

import lombok.Getter;

public abstract class Item {

    protected int calories;
    protected double price;

    public Item(int calories, double price) {
        this.calories = calories;
        this.price = price;
    }

    public int getCalories() {
        return calories;
    }

    public double getPrice() {
        return price;
    }
}