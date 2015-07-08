package com.hackbulgaria51.week3.travelexpenses;

public class Employee {
    private String name;
    private TravelExpense[] travelExpenses;
    private int counter = 0;

    public Employee(String name) {
        travelExpenses = new TravelExpense[10];
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public void addTravelExpenses(TravelExpense te) {
        travelExpenses[counter++] = te;
    }

    public int getEmployeeAllExpenses() {
        int sum = 0;
        for (int i = 0; i < getTravelExpenses().length; i++) {
            if (getTravelExpenses()[i] == null) {
                break;
            }
            sum += getTravelExpenses()[i].getNetCost();
        }
        return sum;
    }

    public TravelExpense[] getTravelExpenses() {
        return travelExpenses;
    }

    public void setTravelExpenses(TravelExpense[] travelExpenses) {
        this.travelExpenses = travelExpenses;
    }
}
