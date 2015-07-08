package com.hackbulgaria51.week1;

import java.util.Scanner;

public class PalindromeScore {
    private static int reverseNumber(int n) {
        int reverse = 0;
        while (n != 0) {
            int remainder = n % 10;
            reverse = reverse * 10 + remainder;
            n = n / 10;
        }
        return reverse;
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int counter = 1;
        int tempResult = 0;
        while (true) {
            int reversedNumber = reverseNumber(number);
            if (number != reversedNumber) {
                tempResult = reversedNumber + number;
                number = tempResult;
                counter++;
            } else {
                break;
            }
        }
        System.out.println(counter);
        sc.close();
    }
}
