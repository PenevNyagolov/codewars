package com.code;

public class IsItNumber {
    public static boolean isDigit(String s)
    {
        if (s.matches("-?\\d+(\\.\\d+)?")){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isDigit("s123"));
    }
}
