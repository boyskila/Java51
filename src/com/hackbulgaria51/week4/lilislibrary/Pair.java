package com.hackbulgaria51.week4.lilislibrary;

public class Pair<F, S> {
    public F first;
    public S second;

    public void put(F first, S second) {
        this.first = first;
        this.second = second;
    }

    public boolean areEquals(F p) {
        return first.equals(p);
    }
}
