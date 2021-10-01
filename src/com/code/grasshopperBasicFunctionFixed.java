package com.code;

public class grasshopperBasicFunctionFixed {
    public static int addFive(int num) {
        int total = num + 5;
        return total;
    }

    public static void main(String[] args) {
        System.out.println(addFive(5));
        System.out.println(addFive(0));
    }
}
