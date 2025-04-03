package ro.ase.acs.main;

import ro.ase.acs.builder.FoodItem;
import ro.ase.acs.builder.FoodItemBuilder;
import ro.ase.acs.builder.FoodItemDirector;
import ro.ase.acs.prototype.BuildingBlock;
import ro.ase.acs.prototype.PrototypeCollection;
import ro.ase.acs.prototype.WoodBlock;

public class Main {
    public static void main(String[] args) {
        BuildingBlock block1 = new WoodBlock();
        block1.setX(1);
        block1.setY(2);
        block1.setZ(3);
        block1.render();

        try {
            BuildingBlock block2 = (BuildingBlock) block1.clone();
            block2.setY(200);
            block2.render();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

        PrototypeCollection collection = new PrototypeCollection();

        BuildingBlock block3 = collection.getBlock("stone");
        BuildingBlock block4 = collection.getBlock("wood");
        block3.render();
        block4.render();

        FoodItem.Builder builder = new FoodItem.Builder();
        builder.addName("Cola").addPrice(7).addIsGlutenFree(true);
        FoodItem item1 = builder.build();
        System.out.println(item1);
        FoodItem item2 = builder.addName("pizza").addPrice(30).
                addDiscount(2).build();
        System.out.println(item2);

        FoodItemBuilder foodItemBuilder = new FoodItemBuilder();
        foodItemBuilder.addName("Burger").addPrice(45).addIsVegan(true);
        FoodItem item3 = foodItemBuilder.build();
        System.out.println(item3);

        FoodItemDirector director = new FoodItemDirector();
        FoodItem item4 = director.create("Pasta", 28, 2);
        System.out.println(item4);
    }
}
