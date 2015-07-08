package com.hackbulgaria51.week2.auto;



public class Auto {
    private Person owner;
    private String brand;
    private String name;
    private int speed;
    private float price;

    public Auto(String brand, String name, int speed, float price, Person owner) {
        this.brand = brand;
        this.name = name;
        this.speed = speed;
        this.price = price;
        this.owner = owner;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("%s %s, Max speed: %d, Price: %.2f, Owner: %s(%d)", brand, name, speed, price,
                owner.getFirstName(), owner.getAge());
    }
}
