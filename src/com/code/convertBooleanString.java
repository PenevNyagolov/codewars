package com.code;

public class convertBooleanString {
    public static String convert(boolean b){
        return String.valueOf(b);
    }

    public static void main(String[] args) {
        System.out.println(convert(true));
        System.out.println(convert(false));
    }
}
