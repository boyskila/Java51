package com.hackbulgaria51.week2.fractions;

public class Fraction {
    private int denominator;
    private int numerator;

    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            denominator = 1;
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction() {
        numerator = 0;
        denominator = 1;
    }

    public float getReal() {
        float result = (float) numerator / (float) denominator;
        return result;
    }

    public Fraction sum(Fraction fraction) {
        Fraction sum = new Fraction();
        sum.numerator = this.numerator * fraction.denominator + fraction.numerator * this.denominator;
        sum.denominator = this.denominator * fraction.denominator;
        sum.simplify();
        return sum;
    }

    public Fraction simplify() {
        int gcd = gcd();
        if (gcd != 0) {
            this.numerator /= gcd;
            this.denominator /= gcd;
        }
        return this;
    }

    private int gcd() {
        int s = this.numerator > this.denominator ? this.denominator : this.numerator;
        for (int i = s; i > 0; i--) {
            if (this.numerator % i == 0 && this.denominator % i == 0) {
                return i; // find gcd
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}
