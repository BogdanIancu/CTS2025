package ro.ase.acs.builder;

import java.time.LocalDate;

public class FoodItemBuilder {
    private String name;
    private float price;
    private float discount;
    private String producer;
    private LocalDate bestBefore;
    private boolean isGlutenFree;
    private boolean isVegan;

    public FoodItemBuilder addName(String name) {
        this.name = name;
        return this;
    }

    public FoodItemBuilder addPrice(float price) {
        this.price = price;
        return this;
    }

    public FoodItemBuilder addDiscount(float discount) {
        this.discount = discount;
        return this;
    }

    public FoodItemBuilder addProducer(String producer) {
        this.producer = producer;
        return this;
    }

    public FoodItemBuilder addBestBefore(LocalDate bestBefore) {
        this.bestBefore = bestBefore;
        return this;
    }

    public FoodItemBuilder addIsGlutenFree(boolean isGlutenFree) {
        this.isGlutenFree = isGlutenFree;
        return this;
    }

    public FoodItemBuilder addIsVegan(boolean isVegan) {
        this.isVegan = isVegan;
        return this;
    }

    public FoodItem build() {
        return new FoodItem(name, price, discount, producer, bestBefore, isGlutenFree, isVegan);
    }
}
