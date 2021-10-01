package com.code;

public class tripleTrouble {
    public static String tripleTrouble(String one, String two, String three) {
        String s = "";
        for (int i = 0; i < one.length(); i++){
            s += "" + one.charAt(i) + two.charAt(i) + three.charAt(i);
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(tripleTrouble("this", "test", "lock"));
        System.out.println(tripleTrouble("aa","bb","cc"));
        System.out.println(tripleTrouble("Bm", "aa", "tn"));
        System.out.println(tripleTrouble("LLh","euo","xtr"));
    }
}
