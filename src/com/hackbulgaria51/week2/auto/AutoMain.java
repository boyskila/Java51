package com.hackbulgaria51.week2.auto;



public class AutoMain {

    public static void main(String[] args) {
        Person ivan = new Person("Ivan", 25);
        Auto audi = new Auto("Audi", "Begachka", 200, 5000, ivan);
        System.out.println(audi);
        Person pepi = new Person("Petar", 25);
        Auto bmw = new Auto("BMW", "Furiya", 300, 1000000, pepi);
        System.out.println(bmw);
    }
}
