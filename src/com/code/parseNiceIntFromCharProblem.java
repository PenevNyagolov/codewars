package com.code;

public class parseNiceIntFromCharProblem {
    public static int howOld(final String herOld) {

        return Integer.parseInt(herOld.substring(0,1));

    }

    public static void main(String[] args) {
        System.out.println(howOld("5 years old"));
        System.out.println(howOld("9 years old"));
        System.out.println(howOld("1 year old"));

    }
}
//
//        assertEquals(5, CharProblem.howOld("5 years old"));
//        assertEquals(9, CharProblem.howOld("9 years old"));
//        assertEquals(1, CharProblem.howOld("1 year old"));
//