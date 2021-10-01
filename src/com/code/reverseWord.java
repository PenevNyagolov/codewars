package com.code;

public class reverseWord {
    public static void main(String[] args) {
        System.out.println(reverseWords("I like eating"));
        System.out.println(reverseWords("I like flying"));
        System.out.println(reverseWords("The world is nice"));

    }
    public static String reverseWords(String str){
        String[] Words = str.split(" ");
        String ris = "";
        for(int i=Words.length-1;i>=0;i--){
            ris = ris+Words[i];
            if(i>0)ris+=" ";
        }
        return ris;
    }
}
