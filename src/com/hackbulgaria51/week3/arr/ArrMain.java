package com.hackbulgaria51.week3.arr;

public class ArrMain {

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5 };
        System.out.println("toString " + Arr.toString(a));

        int[] x = { 3, 1, -40, 200, 5 };
        Arr.sort(x);
        System.out.println("Sort " + Arr.toString(x));

        int[] b = { 3, 1, -40, 200, 5 };
        b = Arr.reverse(b);
        System.out.println("Revers " + Arr.toString(b));

        int[] c = { 3, 1, -40, 200, 5 };
        System.out.println("Join using : " + Arr.join(c, ": "));
        System.out.println("Join using -> " + Arr.join(c, "->"));

        int number = Arr.sum(a);
        System.out.println("Sum " + number);

        int[] e = Arr.range(10, 20);
        System.out.println("Range " + Arr.join(e, ", "));

        int[] d = { 2, 3, 4, 8, 9, 11, 13, 15 };
        int[] temp = Arr.filterOdd(d);
        System.out.println("FilterOdd " + Arr.join(temp, ", "));

    }

}
