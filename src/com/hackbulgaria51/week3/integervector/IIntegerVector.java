package com.hackbulgaria51.week3.integervector;

public interface IIntegerVector {
    public void add(int e);

    public int size();

    public int sum();

    public void addAll(int[] n);

    public int get(int index);

    public void set(int index, int el);

    public void insert(int index, int el);

    public void remove(int index);

    public String toString();

}
