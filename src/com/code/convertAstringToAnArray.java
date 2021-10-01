package com.code;

import java.util.Arrays;

public class convertAstringToAnArray {
    public static String[] stringToArray(String s) {
        String[] str = s.split(" ");
        return str;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(stringToArray("Robin Singh")));
        System.out.println(stringToArray("I love arrays they are my favorite"));

    }
}
