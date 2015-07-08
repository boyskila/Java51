package com.hackbulgaria51.week2.dog;

public class DogMain {
    public static void main(String[] args) {
        Dog sharo = new Dog();
        sharo.name = "Sharo";
        sharo.breed = "Labrador";
        System.out.println(sharo.age);
        sharo.haveAbirthday();
        System.out.println(sharo.age);
        Dog gosho = new Dog();
        gosho.name = "Gosho";
        gosho.breed = "Terrier";
        sharo.barkBark();
        System.out.println();
        gosho.barkBark();
    }
}
