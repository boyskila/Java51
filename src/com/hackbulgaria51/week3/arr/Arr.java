package com.hackbulgaria51.week3.arr;

public class Arr {

    public static String toString(int[] a) {
        String s = "";
        for (int i = 0; i < a.length; i++) {
            if (i < a.length - 1) {
                s += a[i] + ",";
            } else {
                s += a[i];
            }
        }
        return s;
    }

    public static void sort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] < a[j]) {
                    int d = a[i];
                    a[i] = a[j];
                    a[j] = d;
                }
            }
        }
    }

    public static int[] reverse(int[] a) {
        int[] b = new int[a.length];
        for (int i = 0; i < b.length; i++) {
            b[i] = a[a.length - i - 1];
        }
        return b;
    }

    public static String join(int[] a, String glue) {
        String s = "";
        for (int i = 0; i < a.length; i++) {
            if (i < a.length - 1) {
                s += a[i] + glue;
            } else {
                s += a[i];
            }
        }
        return s;
    }

    public static int sum(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }

    public static int[] range(int a, int b) {
        int[] arr = new int[b - a];
        for (int i = a, c = 0; c < arr.length; c++, i++) {
            arr[c] = i;
        }
        return arr;
    }

    public static int[] filterOdd(int[] a) {
        int counter = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                counter++;
            }
        }
        int[] temp = new int[counter];
        for (int i = 0, c = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                temp[c] = a[i];
                c++;
            }
        }
        return temp;
    }
}
