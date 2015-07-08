package com.hackbulgaria51.week3.travelexpenses;

public class TravelExpense {
    private String type;
    private Employee employee;
    private int cost;

    public TravelExpense(String type, Employee employee, int cost) {
        this.type = type;
        this.employee = employee;
        this.cost = cost;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public int getNetCost() {
        return cost;
    }

    public void setNetCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "TravelExpense [type=" + type + ", employee=" + employee + ", cost=" + cost + "]";
    }

}
