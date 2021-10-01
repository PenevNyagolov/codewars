package com.code;

public class returnNedative {
    public static int makeNegative(final int x) {

        return (x < 0) ? x : -x;

    }

    public static void main(String[] args) {
        System.out.println(makeNegative(42));
    }
}
