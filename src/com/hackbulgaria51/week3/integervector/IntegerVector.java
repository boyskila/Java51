package com.hackbulgaria51.week3.integervector;

public class IntegerVector implements IIntegerVector {
    private int[] vector;
    private int counter;
    private static final int INITIAL_sIZE = 10;

    public IntegerVector() {
        counter = 0;
        vector = new int[INITIAL_sIZE];
    }

    public IntegerVector(int[] arr) {
        counter = arr.length;
        vector = new int[counter];
        vector = arr;
    }

    // the array has doubled
    private void resizeArray() {
        int[] temp = vector;
        vector = new int[vector.length * 2];
        for (int i = 0; i < temp.length; i++) {
            vector[i] = temp[i];
        }
    }

    @Override
    public void add(int e) {
        if (counter == vector.length) {
            resizeArray();
        }
        vector[counter++] = e;
    }

    @Override
    public int size() {
        return counter;
    }

    @Override
    public int sum() {
        int sum = 0;
        for (int i = 0; i < size(); i++) {
            sum += vector[i];
        }
        return sum;
    }

    @Override
    public void addAll(int[] n) {
        for (int i = 0; i < n.length; i++) {
            add(n[i]);
        }
    }

    @Override
    public int get(int index) {
        return vector[index];
    }

    @Override
    public void set(int index, int el) {
        vector[index] = el;
    }

    // shift all elements to the right
    @Override
    public void insert(int index, int el) {
        counter++;
        int size = size();
        if (counter == vector.length) {
            resizeArray();
        }
        int[] tempArray = new int[size];
        for (int i = 0; i < index; i++) {
            tempArray[i] = vector[i];
        }
        tempArray[index] = el;
        for (int i = index + 1; i < size; i++) {
            tempArray[i] = vector[i - 1];
        }
        vector = tempArray;
    }

    // shift all elements to the left
    @Override
    public void remove(int index) {
        for (int i = index; i < vector.length - 1; i++) {
            vector[i] = vector[i + 1];
        }
        counter--;
    }

    // print only existing elements
    @Override
    public String toString() {
        String str = "";
        for (int i = 0; i < size(); i++) {
            str += vector[i] + " ";
        }
        return str;
    }
}
