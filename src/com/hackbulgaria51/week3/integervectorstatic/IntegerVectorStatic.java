package com.hackbulgaria51.week3.integervectorstatic;

import com.hackbulgaria51.week3.integervector.IntegerVector;

public class IntegerVectorStatic {
    public static String toString(IntegerVector v) {
        String str = "";
        for (int i = 0; i < v.size(); i++) {
            if (i < v.size() - 1) {
                str += v.get(i) + ", ";
            } else {
                str += v.get(i);
            }
        }
        return str;
    }

    public static void sort(IntegerVector v) {
        for (int i = 0; i < v.size(); i++) {
            for (int j = 0; j < v.size(); j++) {
                if (v.get(i) < v.get(j)) {
                    int a = v.get(i);
                    int b = v.get(j);
                    v.set(i, b);
                    v.set(j, a);
                }
            }
        }
    }

    public static IntegerVector reverse(IntegerVector v) {
        IntegerVector vector = new IntegerVector();
        for (int i = v.size() - 1; i >= 0; i--) {
            vector.add(v.get(i));
        }
        return vector;
    }

    public static String join(IntegerVector v, String glue) {
        String str = "";
        for (int i = 0; i < v.size(); i++) {
            if (i < v.size() - 1) {
                str += v.get(i) + glue;
            } else {
                str += v.get(i);
            }
        }
        return str;
    }

    public static IntegerVector range(int a, int b) {
        IntegerVector vector = new IntegerVector();
        for (int i = a; i < b; i++) {
            vector.add(i);
        }
        return vector;
    }

    public static IntegerVector filterOdd(IntegerVector v) {
        IntegerVector vector = new IntegerVector();
        for (int i = 0; i < v.size(); i++) {
            if (v.get(i) % 2 != 0) {
                vector.add(v.get(i));
            }
        }
        return vector;
    }
}
