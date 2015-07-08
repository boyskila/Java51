package com.hackbulgaria51.week4.vectorofvectors;

import java.util.Scanner;
import java.util.Vector;

public class VectorOfVectors {

    public static Vector<Integer> sort(Vector<Integer> vec) {
        for (int i = 0; i < vec.size(); i++) {
            for (int j = 0; j < vec.size(); j++) {
                if (vec.get(i) < vec.get(j)) {
                    int d = vec.get(i);
                    vec.set(i, vec.get(j));
                    vec.set(j, d);
                }
            }
        }
        return vec;
    }

    public static Vector<Integer> sortAndUnique(Vector<Vector<Integer>> v) {
        Vector<Integer> tempResult = new Vector<>();
        Vector<Integer> result = new Vector<>();
        for (Vector<Integer> vector : v) {
            tempResult.addAll(vector);
        }
        tempResult = sort(tempResult);
        for (int i = 0; i < tempResult.size() - 1; i++) {
            if (tempResult.get(i) != tempResult.get(i + 1)) {
                result.add(tempResult.get(i));
            }
        }
        if (result.lastElement() != tempResult.lastElement()) {
            result.add(tempResult.lastElement());
        }
        return result;
    }

    public static void main(String[] args) {

        Vector<Vector<Integer>> vi = new Vector<>();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int n2 = scanner.nextInt();
            Vector<Integer> v = new Vector<Integer>();
            for (int k = 0; k < n2; k++) {
                v.add(scanner.nextInt());
            }
            vi.add(v);
        }
        System.out.println(sortAndUnique(vi));
        scanner.close();
    }
}
