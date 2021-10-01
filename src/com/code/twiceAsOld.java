package com.code;
//Your function takes two arguments:
//
//        current father's age (years)
//        current age of his son (years)
//        Сalculate how many years ago the father was twice as old as
//        his son (or in how many years he will be twice as old).
public class twiceAsOld {
    public static void main(String[] args) {
        System.out.println(TwiceAsOld(30,25));
    }
    public static int TwiceAsOld(int dadYears, int sonYears){
        return Math.abs((sonYears*2)-dadYears);

    }
}
//    public static int TwiceAsOld(int dadYears, int sonYears){
//
//        int d = 0;
//        int x = 0;
//        d = dadYears - 2 * sonYears;
//
//        if (d >= 0) {
//            x = d;
//        } else {
//            x = -d;
//        }
//        return x;
//    }