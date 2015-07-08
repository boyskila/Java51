package com.hackbulgaria51.week3.travelexpenses;

public class tets {

    public static void main(String[] args) {
        int[] arr = new int[10];
        int[] x = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
            if (i == arr.length - 1) {
                x = arr.clone();
            }
        }
        arr = new int[arr.length + 10];
        for (int i = 0; i < x.length; i++) {
            arr[i] = x[i];
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
