package com.hackbulgaria51.week4.birthdayranges;

public class IntPair {
    public int start;
    public int end;

    public boolean isIn(int date) {
        return date >= start && date <= end;
    }
}
