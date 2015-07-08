package com.hackbulgaria51.week1;

import java.util.Scanner;

public class FromDecimalToBinary {
    private static String toBinary(int number) {
        String tempN = "";
        while (number != 0) {
            tempN = number % 2 + tempN;
            number = number >> 1; // number >> 1 is same like number/2
        }
        return tempN;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(toBinary(number));
        sc.close();
    }
}
