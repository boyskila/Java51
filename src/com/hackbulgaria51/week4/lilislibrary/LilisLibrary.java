package com.hackbulgaria51.week4.lilislibrary;

import java.util.Scanner;
import java.util.Vector;

public class LilisLibrary {
    public static Vector<Pair<String, Integer>> orderBooks(Vector<String> books) {
        Vector<Pair<String, Integer>> vector = new Vector<>();
        // sort books alphabeticaly
        for (int i = 0; i < books.size(); i++) {
            for (int j = 0; j < books.size(); j++) {
                char bookAchar = books.get(i).charAt(0);
                char bookBchar = books.get(j).charAt(0);
                if (bookAchar < bookBchar) {
                    String d = books.get(i);
                    books.set(i, books.get(j));
                    books.set(j, d);
                }
            }
        }
        // create pairs of books and their count in the library and add them to
        // the vector
        int counter = 0;
        for (String book : books) {
            Pair<String, Integer> b = new Pair<>();
            b.put(book, counter);
            vector.add(b);
        }
        // increment book counter if repeats
        for (Pair<String, Integer> book : vector) {
            for (Pair<String, Integer> pair : vector) {
                if (book.first.equals(pair.first)) {
                    book.second += 1;
                }
            }
        }
        // filter books
        Vector<Pair<String, Integer>> v = new Vector<>();
        for (int i = 0; i < vector.size() - 1; i++) {
            if (!vector.get(i).first.equals(vector.get(i + 1).first)) {
                v.add(vector.get(i));
            }
        }
        if (vector.lastElement() != v.lastElement()) {
            v.add(vector.lastElement());
        }

        return v;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int booksCount = scanner.nextInt();
        Vector<String> books = new Vector<>();

        for (int i = 0; i <= booksCount; i++) {
            String book = scanner.nextLine();
            books.add(book);
        }
        books.remove(0);

        Vector<Pair<String, Integer>> result = orderBooks(books);

        for (Pair<String, Integer> titleCount : result) {
            System.out.println(titleCount.first + " : " + titleCount.second);
        }
        scanner.close();
    }
}
