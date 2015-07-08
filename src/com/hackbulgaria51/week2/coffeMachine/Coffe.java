package com.hackbulgaria51.week2.coffeMachine;

import java.io.Serializable;

public class Coffe implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private float pricePerPackage;
    private float pricePerCup;
    private float tempPrice;

    public Coffe() {

    }

    public Coffe(String name, float price, float pricePerCup) {
        this.name = name;
        this.pricePerPackage = price;
        this.setPricePerCup(pricePerCup);
        setTempPrice(price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPricePerPackage() {
        return pricePerPackage;
    }

    public void setPricePerPackage(float price) {
        this.pricePerPackage = price;
    }

    public float getPricePerCup() {
        return pricePerCup;
    }

    public void setPricePerCup(float pricePerCup) {
        this.pricePerCup = pricePerCup;
    }

    public float getTempPrice() {
        return tempPrice;
    }

    public void setTempPrice(float tempPrice) {
        this.tempPrice = tempPrice;
    }

    @Override
    public String toString() {
        return name + " " + pricePerPackage;
    }
}
