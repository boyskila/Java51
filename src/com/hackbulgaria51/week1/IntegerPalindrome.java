package com.hackbulgaria51.week1;
import java.util.Scanner;

public class IntegerPalindrome {
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
        int n = sc.nextInt();
        int reversedNumber = reverseNumber(n);
        int sum = reversedNumber + n;
        if (sum == reverseNumber(sum)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        sc.close();
    }
}
