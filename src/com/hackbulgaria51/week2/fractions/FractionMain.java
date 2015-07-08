package com.hackbulgaria51.week2.fractions;

public class FractionMain {

    public static void main(String[] args) {
        Fraction fraction1 = new Fraction(2222, 612);
        System.out.println("Fraction1 is: " + fraction1);
        Fraction fraction2 = new Fraction(112, 423);
        System.out.println("Fraction2 is: " + fraction2);
        Fraction sum = new Fraction();
        sum = fraction1.sum(fraction2);
        System.out.printf("Sum of %s and %s is %s%n", fraction1, fraction2, sum);
        System.out.printf("Fraction to decimal result is: %.2f%n", sum.getReal());
        Fraction newFraction = new Fraction(234, 12);
        System.out.println(newFraction);
        System.out.println("After simplifying the new fraction is " + newFraction.simplify());
    }
}
