package com.hackbulgaria51.week2.coffeMachine;

import java.io.IOException;
import java.util.Scanner;

public class Shop {
    CoffeMachine cm = new CoffeMachine();
    Scanner sc = new Scanner(System.in);

    public Shop() throws ClassNotFoundException, IOException {
        loadCoffeMachine();
        cm.printCoffeMachineContent();
        makeOrder();
    }

    private void makeOrder() throws IOException, ClassNotFoundException {
        int option = sc.nextInt();
        Coffe choosenCoffe = new Coffe();
        switch (option) {
            case 1:
                choosenCoffe = CoffeStorage.inka;
                break;
            case 2:
                choosenCoffe = CoffeStorage.novaBrazilia;
                break;
            case 3:
                choosenCoffe = CoffeStorage.lavaza;
                break;
            case 4:
                choosenCoffe = CoffeStorage.turkishCoffe;
                break;
            case 5:
                choosenCoffe = CoffeStorage.crema;
                break;
            case 6:
                choosenCoffe = CoffeStorage.espresso;
                break;
            case 7:
                choosenCoffe = CoffeStorage.davidov;
                break;
            case 8:
                choosenCoffe = CoffeStorage.spetema;
                break;
            case 9:
                choosenCoffe = CoffeStorage.primavera;
                break;
            case 10:
                choosenCoffe = CoffeStorage.novaBrazilia3;
                break;
            default:
                break;
        }
        if (choosenCoffe.getPricePerPackage() >= choosenCoffe.getPricePerCup()) {
            System.out.printf("Balance before order %.2f%n", cm.getBalance());
            System.out.printf("The price of %s is %.2f per cup%nPlease drop %.2f cents", choosenCoffe.getName(),
                    choosenCoffe.getPricePerCup(), choosenCoffe.getPricePerCup());
            float dropedCoins = dropMoney();
            cm.buyCoffee(choosenCoffe, dropedCoins);
            System.out.printf("%nBalance after order is %.2f%n", cm.getBalance());
            System.out.printf("Change is: %.2f", cm.returnChange(choosenCoffe, dropedCoins));
        } else {
            System.out.printf("%s is out of stock%n", choosenCoffe.getName());
            choosenCoffe.setPricePerPackage(0);
            System.out.println("Please choose another product");
            makeOrder();
        }
        FileMenager.serialize(CoffeStorage.coffes, "coffes.srz");
    }

    private void loadCoffeMachine() throws ClassNotFoundException, IOException {
        for (Coffe coffe : CoffeStorage.loadCoffeMachine()) {
            cm.addCoffee(coffe);
        }
    }

    private float dropMoney() {
        return sc.nextFloat();
    }
}
