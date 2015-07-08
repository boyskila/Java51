package com.hackbulgaria51.week2.coffeMachine;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CoffeStorage {
    public static List<Coffe> coffes;
    public static Coffe inka = new Coffe("Inka", 6.00f, 0.60f);
    public static Coffe novaBrazilia = new Coffe("Nova Brazilia", 4.50f, 0.45f);
    public static Coffe lavaza = new Coffe("Lavaza", 7.00f, 0.70f);
    public static Coffe turkishCoffe = new Coffe("Turkish", 8.00f, 0.80f);
    public static Coffe crema = new Coffe("Crema", 6.50f, 0.65f);
    public static Coffe espresso = new Coffe("Espresso", 7.00f, 0.70f);
    public static Coffe spetema = new Coffe("Spetema", 6.00f, 0.60f);
    public static Coffe davidov = new Coffe("Davidov", 4.50f, 0.45f);
    public static Coffe lavaza2 = new Coffe("Lavaza2", 6.50f, 0.65f);
    public static Coffe novaBrazilia3 = new Coffe("Nova Brazilia3", 4.50f, 0.45f);
    public static Coffe primavera = new Coffe("Primavera", 7.00f, 0.70f);

    public CoffeStorage() {
        coffes = new ArrayList<Coffe>();
        coffes.add(inka);
        coffes.add(novaBrazilia);
        coffes.add(lavaza);
        coffes.add(turkishCoffe);
        coffes.add(crema);
        coffes.add(espresso);
        coffes.add(spetema);
        coffes.add(davidov);
        coffes.add(primavera);
        coffes.add(novaBrazilia3);
    }

    public static List<Coffe> loadCoffeMachine() throws ClassNotFoundException, IOException {
        File file = new File("coffes.srz");
        if (file.exists()) {
            coffes = FileMenager.deserialize("coffes.srz");
        } else {
            coffes = new ArrayList<Coffe>();
            coffes.add(inka);
            coffes.add(novaBrazilia);
            coffes.add(lavaza);
            coffes.add(turkishCoffe);
            coffes.add(crema);
            coffes.add(espresso);
            coffes.add(spetema);
            coffes.add(davidov);
            coffes.add(primavera);
            coffes.add(novaBrazilia3);
            FileMenager.serialize(coffes, "coffes.srz");
        }
        return coffes;
    }
}
