package com.hackbulgaria51.week2.fridge;

public class FridgeTest {
    public void run() {
        Fridge fridge = new Fridge(10);
        fridge.addFood(new Food("Cheese", ProductType.Cheese, 300));
        fridge.addFood(new Food("Milk", ProductType.Milk, 1000));
        fridge.addFood(new Food("Beer", ProductType.Bevarage, 500));
        System.out.println("Fridge Content\n" + fridge);
        System.out.println("Products count: " + fridge.getFoodsCount());
        System.out.println("Products current weight: " + fridge.getCurrentWeight());
        fridge.addFood(new Food("Cheese", ProductType.Milk, 300));
        Food[] food = fridge.getProductsOfType(ProductType.Milk);
        System.out.println("All products of type " + ProductType.Milk + ":");
        for (Food food2 : food) {
            if (food2 != null) {
                System.out.println(food2);
            } else {
                break;
            }
        }
        System.out.println();
        System.out.println("Fridge current weight: " + fridge.getCurrentWeight());
        System.out.println("Fridge heaviest food: " + fridge.getHeaviestFood());
        System.out.println("Fridge max food capacity: " + fridge.getFoodCapacity());
        Fridge fridge2 = new Fridge(10, 3000);
        System.out.println("Fridge2 max capacity: " + fridge2.getFridgeCapacity());
    }
}
