package com.hackbulgaria51.week4.birthdayranges;

import java.util.Scanner;
import java.util.Vector;

public class BirthdayRanges {
    public static Vector<Integer> birthdaysCount(Vector<Integer> birthdays, Vector<IntPair> range) {
        Vector<Integer> result = new Vector<>();
        for (int j = 0; j < range.size(); j++) {
            IntPair pair = range.get(j);
            int counter = 0;
            for (int i = 0; i < birthdays.size(); i++) {
                int date = birthdays.get(i);
                if (pair.isIn(date)) {
                    counter++;
                }
            }
            result.add(counter);
        }
        return result;
    }

    public static void main(String[] args) {
        Vector<Integer> birthdays = new Vector<Integer>();
        Vector<IntPair> ranges = new Vector<IntPair>();
        Scanner scanner = new Scanner(System.in);
        int bdaysCount = scanner.nextInt();
        int rangesCount = scanner.nextInt();
        for (int i = 0; i < bdaysCount; i++) {
            birthdays.add(scanner.nextInt());
        }
        for (int i = 0; i < rangesCount; i++) {
            IntPair pair = new IntPair();
            pair.start = scanner.nextInt();
            pair.end = scanner.nextInt();
            ranges.add(pair);
        }
        Vector<Integer> result = birthdaysCount(birthdays, ranges);
        for (int count : result) {
            System.out.println(count);
        }
        scanner.close();
    }
}
