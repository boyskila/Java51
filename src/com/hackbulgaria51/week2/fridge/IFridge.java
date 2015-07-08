package com.hackbulgaria51.week2.fridge;

public interface IFridge {
    public void addFood(Food f);

    public int getFoodsCount();

    public Food[] getProductsOfType(ProductType type);

    public Food getHeaviestFood();
}
