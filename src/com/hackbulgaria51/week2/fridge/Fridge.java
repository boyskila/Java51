package com.hackbulgaria51.week2.fridge;

public class Fridge implements IFridge {
    private Food[] foods;
    private int foodCapacity; // max number of foods in the fridge
    private int fridgeCapacity;// maximum capacity of Fridge
    private int currentWeight;
    private int counter = 0;

    public Fridge(int foodCapacity) {
        this.foodCapacity = foodCapacity;
        foods = new Food[this.foodCapacity];
    }

    public Fridge(int foodCapacity, int fridgeCapacity) {
        this.foodCapacity = foodCapacity;
        foods = new Food[this.foodCapacity];
        this.fridgeCapacity = fridgeCapacity;
    }

    @Override
    public void addFood(Food someFood) {
        foods[counter++] = someFood;
    }

    @Override
    // counts number of products in the fridge
    public int getFoodsCount() {
        for (int i = 0; i < foods.length; i++) {
            if (foods[i] == null) {
                return i;
            }
        }
        return 0;
    }

    @Override
    // show all products from passed type
    public Food[] getProductsOfType(ProductType type) {
        int counter = 0;
        Food[] commonTypeFoods = new Food[foodCapacity];
        for (Food food : foods) {
            if (food == null) {
                break;
            }
            if (food != null && food.getType().equals(type)) {
                commonTypeFoods[counter++] = food;
            }
        }
        return commonTypeFoods;
    }

    @Override
    // show haviest food
    public Food getHeaviestFood() {
        Food haviestFood = new Food("", ProductType.Bevarage, 0);
        for (Food food : foods) {
            if (food == null) {
                break;
            }
            if (haviestFood.getWeight() < food.getWeight()) {
                haviestFood = food;
            }
        }
        return haviestFood;
    }

    public Food[] getFoods() {
        return foods;
    }

    public void setFoods(Food[] foods) {
        this.foods = foods;
    }

    public int getFoodCapacity() {
        return foodCapacity;
    }

    public void setFoodCapacity(int foodCapacity) {
        this.foodCapacity = foodCapacity;
    }

    public int getFridgeCapacity() {
        return fridgeCapacity;
    }

    public void setFridgeCapacity(int fridgeCapacity) {
        this.fridgeCapacity = fridgeCapacity;
    }

    // show current fridge weight
    public int getCurrentWeight() {
        currentWeight = 0;
        for (Food food : foods) {
            if (food != null) {
                currentWeight += food.getWeight();
            } else {
                break;
            }
        }
        return currentWeight;
    }

    public void setCurrentWeight(int currentWeight) {
        this.currentWeight = currentWeight;
    }

    @Override
    // print fridge content
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Food food : foods) {
            if (food != null) {
                sb.append(food + "\n");
            } else {
                break;
            }

        }
        return sb.toString();
    }
}
