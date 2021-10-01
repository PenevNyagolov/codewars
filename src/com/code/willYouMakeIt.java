package com.code;

public class willYouMakeIt {
    public static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {
        return distanceToPump <= fuelLeft * mpg;
    }

    public static void main(String[] args) {
        System.out.println(zeroFuel(55,77,3));
    }
}
