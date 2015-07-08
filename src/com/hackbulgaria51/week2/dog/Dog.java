package com.hackbulgaria51.week2.dog;

public class Dog {
    public String name = "";
    public String breed = "";
    public int age = 0;

    public void haveAbirthday() {
        age = age + 1;
    }

    public void barkBark() {
        System.out.printf("Woof!Woof! I'm %s ", name);
    }
}
