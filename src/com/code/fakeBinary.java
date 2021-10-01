package com.code;
//Given a string of digits, you should replace any digit
//        below 5 with '0' and any digit 5 and above with '1'. Return the
//        resulting string.
public class fakeBinary {
    public static String fakeBin(String numberString) {
        return numberString.replaceAll("[0-4]", "0").replaceAll("[5-9]", "1");
    }
    public static void main(String[] args) {
        System.out.println(fakeBin("12345"));
    }
}
//    public static String fakeBin(String numberString) {
//        String res = "";
//        for (int i = 0; i < numberString.length(); i++) {
//            if (numberString.charAt(i) < '5') {
//                res += '0';
//            } else {
//                res += '1';
//            }
//        }
//        return res;
//    }