package com.code;

public class removeFirstAndLastCharacter {
    public static String remove(String str) {

        String result = str.substring(1, str.length() - 1);

        return result;
    }

    public static void main(String[] args) {
        System.out.println(remove("eloquent"));
        System.out.println(remove("country"));
        System.out.println(remove("person"));
        System.out.println(remove("place"));
    }
}
