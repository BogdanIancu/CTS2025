package ro.ase.acs.builder;

public class FoodItemDirector {
    private FoodItemBuilder builder;

    public FoodItem create(String name, float price, String producer){
        builder = new FoodItemBuilder();
        builder.addName(name).addPrice(price).addProducer(producer);
        return builder.build();
    }

    public FoodItem create(String name, float price, float discount){
        builder = new FoodItemBuilder();
        builder.addName(name).addPrice(price).addDiscount(discount);
        return builder.build();
    }
}
