package com.hackbulgaria51.week1;

import java.util.Scanner;

public class Calculator {
    private static long pow(int a, int b) {
        long result = 1;
        for (int i = 0; i < b; i++) {
            result *= a;
        }
        return result;
    }

    private static long factorial(int number) {

        int fact = 1;
        for (int i = 1; i <= number; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char operator = sc.next().charAt(0);
        int b = sc.nextInt();
        int result = 0;
        switch (operator) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
            case '^':
                result = (int) pow(a, b);
                break;
            case '?':
                result = (int) factorial(a);
                result += factorial(b);
                break;
            default:
                break;
        }
        System.out.println(result);
        sc.close();
    }
}
