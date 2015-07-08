package com.hackbulgaria51.week3.travelexpenses;

import java.util.Arrays;

public class Travel {
    private String city;
    private String country;
    private int vat;
    private TravelExpense[] travelExpenses;
    private int counter;

    public Travel(String city, String country, int vat) {
        this.city = city;
        this.country = country;
        this.setVat(vat);
        travelExpenses = new TravelExpense[2];
        counter = 0;
    }

    private TravelExpense[] resizeArray(TravelExpense[] travelExp) {

        TravelExpense[] x = new TravelExpense[travelExp.length];
        x = travelExp.clone();
        travelExp = new TravelExpense[travelExp.length + 4];
        for (int i = 0; i < x.length; i++) {
            travelExp[i] = x[i];
        }
        return travelExp;
    }

    public void addExpense(TravelExpense travelExpense) {
        travelExpense.getEmployee().addTravelExpenses(travelExpense);
        if (counter == travelExpenses.length - 1) {
            travelExpenses = resizeArray(travelExpenses);
        }
        travelExpenses[counter++] = travelExpense;
    }

    public int getTotalNetCost() {
        int sum = 0;
        for (int i = 0; i < travelExpenses.length; i++) {
            if (travelExpenses[i] != null) {
                sum += travelExpenses[i].getNetCost();
            }
        }
        return sum;
    }

    public int getTotalCost() {
        double Vat = (double) getVat() / 10;
        double totalTax = (getTotalNetCost() * Vat) / 10;
        return (int) (getTotalNetCost() + totalTax);
    }

    public Employee[] mostExpensesMadeBy() {
        int[] expenses = new int[travelExpenses.length];
        for (int i = 0; i < travelExpenses.length; i++) {
            if (travelExpenses[i] != null) {
                expenses[i] = travelExpenses[i].getNetCost();
            }
        }
        Arrays.sort(expenses);
        Employee[] emp = new Employee[2];
        for (int i = 0; i < expenses.length; i++) {
            if (travelExpenses[i] != null) {
                if (expenses[expenses.length - 1] == travelExpenses[i].getNetCost()
                        || expenses[expenses.length - 2] == travelExpenses[i].getNetCost()) {
                    if (emp[1] == null) {
                        emp[1] = travelExpenses[i].getEmployee();
                    } else if (emp[0] == null) {
                        emp[0] = travelExpenses[i].getEmployee();
                    }
                }
            }
        }
        return emp;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getVat() {
        return vat;
    }

    public void setVat(int vat) {
        this.vat = vat;
    }
}
