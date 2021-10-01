package com.code;

public class reverseWorlds {
    public static String reverseWords(String str){
        String[] words = str.split(" ");
        for (int i = 0; i < words.length / 2; i++) {
            String temp = words[i];
            words[i] = words[words.length - i - 1];
            words[words.length - i - 1] = temp;
        }
        return String.join(" ", words);
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("I like eating"));
        System.out.println(reverseWords("I like flying"));
        System.out.println(reverseWords("The world is nice"));
    }
}
