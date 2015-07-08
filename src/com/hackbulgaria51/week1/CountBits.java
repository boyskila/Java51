package com.hackbulgaria51.week1;

import java.util.Scanner;

public class CountBits {
    /*
     return the length from first meeting "1" until the end of the string
     */
    private static int countBits(int n) {
        String number = Integer.toBinaryString(n);
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == '1') {
                return number.length() - i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(countBits(number));
        sc.close();
    }
}
