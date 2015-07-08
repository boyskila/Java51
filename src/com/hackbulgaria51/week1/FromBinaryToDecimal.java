package com.hackbulgaria51.week1;

import java.util.Scanner;

public class FromBinaryToDecimal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = sc.next();
        System.out.println(toDecimal(number));
        sc.close();
    }

    private static int toDecimal(String n) {
        int counter = 0;
        int sum = 0;
        for (int i = n.length() - 1; i >= 0; i--) {
            // 1 << counter - mean "2" power of index position of the "1" from
            // right to the left
            sum += n.charAt(i) == '1' ? 1 << counter : 0;
            counter++;
        }
        return sum;
    }
}
