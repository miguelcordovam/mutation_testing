package com.miguel.mutations;

public class Operations {

    public int add (int a, int b) {

        return a + b;
    }

    public boolean isGreaterThan (int number, int param) {
        return (number > param);
    }

    public double calculateDiscount(int total) {

        if (total < 100) {
            return 0.15 * total;
        } else {
            return 0.25 * total;
        }

    }

}
