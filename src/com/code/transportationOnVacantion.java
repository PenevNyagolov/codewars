package com.code;

public class transportationOnVacantion {
    public static int rentalCarCost(int d) {
        int total = 40 * d;
        if (d >= 7) {
            total -= 50;
        } else if (d >= 3) {
            total -= 20;
        }

        return total;
    }

    public static void main(String[] args) {
        System.out.println(rentalCarCost(1));
        System.out.println(rentalCarCost(2));
        System.out.println(rentalCarCost(3));
        System.out.println(rentalCarCost(4));
        System.out.println(rentalCarCost(5));
        System.out.println(rentalCarCost(6));
        System.out.println(rentalCarCost(7));
        System.out.println(rentalCarCost(8));
        System.out.println(rentalCarCost(9));
        System.out.println(rentalCarCost(10));

    }
}
