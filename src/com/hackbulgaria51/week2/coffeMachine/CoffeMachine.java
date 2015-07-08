package com.hackbulgaria51.week2.coffeMachine;

import java.io.IOException;

public class CoffeMachine {
    private Coffe[] coffes;
    private int counter = 0;
    private float balance;
    private int machineCapacity = 10;

    public CoffeMachine() {
        coffes = new Coffe[machineCapacity];
    }

    public boolean addCoffee(Coffe coffe) {
        boolean isMachineFull = false;
        if (counter < 10) {
            isMachineFull = true;
            this.coffes[counter++] = coffe;
            setBalance(getBalance() + coffe.getPricePerPackage());
        }
        if (!isMachineFull) {
            System.out.println("Can't add more products, Coffe machine is full");
        }
        return isMachineFull;
    }

    public void buyCoffee(Coffe coffe, float price) throws ClassNotFoundException, IOException {
        for (int i = 0; i < coffes.length; i++) {
            Coffe coff = this.coffes[i];
            if (coff.getName().equals(coffe.getName())) {
                if (coff.getPricePerPackage() >= coff.getPricePerCup()) {
                    coff.setPricePerPackage(coff.getPricePerPackage() - coff.getPricePerCup());
                    setBalance(getBalance() - coff.getPricePerCup());
                } else {
                    System.out.printf("%n%s is out of stock%n%n", coffe.getName());
                    coffe.setPricePerPackage(0);
                    new Shop();
                }
                break;
            }
        }
    }

    public void printCoffeMachineContent() {
        System.out.println("Please select a product");
        for (int i = 0; i < coffes.length; i++) {
            Coffe coff = this.coffes[i];
            int button = i + 1;
            String coffes = String.format("Press %d %s %.2f", button, coff.getName(), coff.getPricePerPackage());
            System.out.println(coffes);
        }
    }

    public float returnChange(Coffe coffe, float dropedCoins) {
        return dropedCoins - coffe.getPricePerCup();
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }
}
