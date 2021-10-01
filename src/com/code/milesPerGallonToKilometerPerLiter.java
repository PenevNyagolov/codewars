package com.code;

public class milesPerGallonToKilometerPerLiter {
    public static void main(String[] args) {
        System.out.println(mpgToKPM(10));
    }
    public static float mpgToKPM(final float mpg) {
        return Math.round(mpg * 1.609344f/4.54609188f * 100f)/100f;
    }
}
