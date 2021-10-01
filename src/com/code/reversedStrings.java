package com.code;

public class reversedStrings {
    public static String solution(String str) {
        char[] inputStringArray = str.toCharArray();
        String reverseString = "";
        for (int i = inputStringArray.length - 1; i >= 0; i--) {
            reverseString += inputStringArray[i];
        }
        return reverseString;
    }

    public static void main(String[] args) {
        System.out.println(solution("world"));
    }
}
