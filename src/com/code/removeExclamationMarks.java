package com.code;

public class removeExclamationMarks {
    public static String removeExclamationMarks(String s) {
        return s.replace("!", "");
    }

    public static void main(String[] args) {
        System.out.println(removeExclamationMarks("Hello World!"));

    }
}
