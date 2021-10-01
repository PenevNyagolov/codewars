package com.code;

public class grasshopperSummation {
    public static int summation(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(summation(1));
        System.out.println(summation(8));

    }
}
