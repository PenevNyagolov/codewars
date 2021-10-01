package com.code;

public class abbreviateAtwoWordName {
    public static String abbrevName(String name) {

        String[] nameSplit = name.toUpperCase().split(" ");
        return nameSplit[0].substring(0, 1) + '.' + nameSplit[1].substring(0, 1);
    }

    public static void main(String[] args) {
        System.out.println(abbrevName("Sam Harris"));
        System.out.println(abbrevName("Patrick Feenan"));
        System.out.println(abbrevName("Evan Cole"));
        System.out.println(abbrevName("P Favuzzi"));
        System.out.println(abbrevName("David Mendieta"));

    }
}
