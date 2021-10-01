package com.code;

public class findThePosition {
    public static String position(char alphabet) {
        return "Position of alphabet: " + (alphabet - 96);
    }

    public static void main(String[] args) {

        System.out.println(position('a'));
        System.out.println(position('z'));
        System.out.println(position('e'));

    }
}
