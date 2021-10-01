package com.code;
//Write a function called repeat_string which repeats
//        the given string str exactly count times.
//
//        repeatStr(6, "I") // "IIIIII"
//        repeatStr(5, "Hello") // "HelloHelloHelloHelloHello"
public class stringRepeat {
    public static void main(String[] args) {

        System.out.println(repeatStr(6,"I"));
    }
    public static String repeatStr(final int repeat, final String string) {

//        String res = "";
//        for (int i = 0; i < repeat; i++) {
//            res += string;
//        }
//        return res;
        return string.repeat(repeat);
    }
}
