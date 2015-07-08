package com.hackbulgaria51.week2.fridge;

public class Food {
    private String name;
    private ProductType type;
    private int weight;

    public Food(String name, ProductType type, int weight) {
        this.name = name;
        this.type = type;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProductType getType() {
        return type;
    }

    public void setType(ProductType type) {
        this.type = type;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return String.format("%s - %s: %dgrams", name, type, weight);
    }

}
