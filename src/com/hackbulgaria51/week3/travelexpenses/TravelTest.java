package com.hackbulgaria51.week3.travelexpenses;

public class TravelTest {

    public static void main(String[] args) {
        Employee ivo = new Employee("Ivaylo");
        Employee rado = new Employee("Rado");
        Employee boyko = new Employee("Boyko");
        Employee gosho = new Employee("Gosho");
        Employee pesho = new Employee("Pesho");
        Employee radko = new Employee("Radko");

        Travel conf = new Travel("Sofia", "Bulgaria", 25);

        TravelExpense dinnerRado = new TravelExpense("Dinner", rado, 100);
        TravelExpense dinnerIvo = new TravelExpense("Dinner", ivo, 420);
        TravelExpense lunchIvo = new TravelExpense("Lunch", ivo, 220);
        TravelExpense dinnerBoyko = new TravelExpense("Dinner", boyko, 300);
        TravelExpense lunchBoyko = new TravelExpense("Lunch", boyko, 200);
        TravelExpense dinnerGosho = new TravelExpense("Dinner", gosho, 320);
        TravelExpense lunchGosho = new TravelExpense("Lunch", gosho, 400);
        TravelExpense dinnerPesho = new TravelExpense("Dinner", pesho, 330);
        TravelExpense dinnerRadko = new TravelExpense("Dinner", radko, 300);

        conf.addExpense(dinnerRado);
        conf.addExpense(dinnerIvo);
        conf.addExpense(lunchIvo);
        conf.addExpense(dinnerBoyko);
        conf.addExpense(lunchBoyko);
        conf.addExpense(dinnerGosho);
        conf.addExpense(lunchGosho);
        conf.addExpense(dinnerPesho);
        conf.addExpense(dinnerRadko);

        System.out.println(conf.getTotalCost()); // 120

        Employee[] toFire = conf.mostExpensesMadeBy();

        for (Employee employee : toFire) {
            System.out.println(employee);
        }
        System.out.println(ivo.getEmployeeAllExpenses());
        for (int i = 0; i < ivo.getTravelExpenses().length; i++) {
            if (ivo.getTravelExpenses()[i] == null) {
                break;
            }
            System.out.println(ivo.getTravelExpenses()[i]);
        }
        
    }
}
