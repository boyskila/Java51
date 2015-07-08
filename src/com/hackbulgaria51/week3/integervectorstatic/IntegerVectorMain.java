package com.hackbulgaria51.week3.integervectorstatic;

import com.hackbulgaria51.week3.integervector.IntegerVector;

public class IntegerVectorMain {
    public static void main(String[] args) {
        IntegerVector v = new IntegerVector();
        for (int i = 0; i < 20; i++) {
            v.add(i);
        }
        v.set(10, 100);
        // System.out.println(v.get(10));
        v.insert(10, 1000);
        v.add(1);
        System.out.println("Insert 1000 at index 10: " + v.toString());
        System.out.println(v.size());
        v.remove(10);
        System.out.println("Remove index 10: " + v.toString());
        int[] array = { 3, 1, -40, 200, 5 };
        v.addAll(array);
        IntegerVectorStatic.sort(v);
        System.out.println("Sorted array: " + IntegerVectorStatic.toString(v));

        System.out.println("Sum all numbers in vector: " + v.sum());

        IntegerVector temp = IntegerVectorStatic.reverse(v);
        System.out.println("Reversed array " + IntegerVectorStatic.toString(temp));

        System.out.println("Join using : " + IntegerVectorStatic.join(v, ": "));
        System.out.println("Join using -> " + IntegerVectorStatic.join(v, "-> "));
        v = IntegerVectorStatic.range(10, 20);
        System.out.println("Range: from index 10 to index 20: " + IntegerVectorStatic.toString(v));

        IntegerVector vector = new IntegerVector();
        int[] arr = { 2, 3, 4, 8, 9, 11, 13, 15 };
        vector.addAll(arr);
        IntegerVector tempArray = IntegerVectorStatic.filterOdd(vector);
        System.out.println("Get only odd numbers: " + tempArray);
    }
}
