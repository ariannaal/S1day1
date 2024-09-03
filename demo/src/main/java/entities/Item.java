package entities;

import lombok.Getter;

@Getter
public abstract class Item {

    protected Double price;
    protected int calorie;

    public Item(Double price, int calorie) {
        this.price = price;
        this.calorie = calorie;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getCalorie() {
        return calorie;
    }

    public void setCalorie(int calorie) {
        this.calorie = calorie;
    }
}
