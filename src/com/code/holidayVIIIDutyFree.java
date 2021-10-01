package com.code;

public class holidayVIIIDutyFree {
    public static int dutyFree(int normPrice, int discount, int hol) {
//double a = normPrice * discount / 100;
        float result = (hol /normPrice / discount);
//        double result = 2.94 * 100;
//        double result = hol / 1.7;
        float a = result * 100;
        return (int)Math.abs(a);

    }

    public static void main(String[] args) {
//        System.out.println(dutyFree(12,50,1000));
        System.out.println(dutyFree(17,10,500));
//        System.out.println(dutyFree(24,35,3000));
//        System.out.println(dutyFree(1400,35,10000));
//        System.out.println(dutyFree(700,26,7000));
    }
}
