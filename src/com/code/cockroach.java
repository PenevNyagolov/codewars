package com.code;

public class cockroach {
    public static int cockroachSpeed(double x) {
        return (int) (x / 0.036);
    }

    public static void main(String[] args) {
        System.out.println(cockroachSpeed(1.08));
        System.out.println(cockroachSpeed(1.09));
        System.out.println(cockroachSpeed(0));

    }
}
