package com.code;

public class stringDrillsRepeater {
        public static String repeat(String string,long n){
            return string.repeat((int)n);
        }

    public static void main(String[] args) {
        System.out.println(repeat("a",5));
        System.out.println(repeat("Na", 16));
        System.out.println(repeat("Wub ", 6));

    }
}
