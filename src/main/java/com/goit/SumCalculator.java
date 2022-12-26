package com.goit;

public class SumCalculator {
    public int sum(int n) {
        if (n < 1) {
            throw new IllegalArgumentException(" n should be more than zero!");
        }
        int result = 0;
        for (int i = 0; i <= n; i++) {
            result += i;
        }
        return result;
    }
}
