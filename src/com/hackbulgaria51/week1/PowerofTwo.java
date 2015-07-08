package com.hackbulgaria51.week1;

import java.util.Scanner;

public class PowerofTwo {

    // if the number contains only one "1" the number is on power of two

    private static boolean isPowerOfTwo(int number) {
        int counter = 0;
        while (number > 0) {
            int tempN = number % 10;
            number = number / 10;
            counter += tempN == 1 ? 1 : 0;
        }
        return counter > 1 ? false : true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(isPowerOfTwo(number));
        sc.close();
    }
}
