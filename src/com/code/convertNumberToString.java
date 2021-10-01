package com.code;

public class convertNumberToString {
    public static void main(String[] args) {
        System.out.println(numberToString(67));
        System.out.println(numberToString(123));
        System.out.println(numberToString(999));

    }
    public static String numberToString(int num) {
        return Integer.toString(num);
    }
}
