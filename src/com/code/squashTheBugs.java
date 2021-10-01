package com.code;

public class squashTheBugs {
    public static int findLongest(final String str){
        String[] spl = str.split(" ");
        int longest = 0;
        for (int i = 0; i < spl.length; i++){
            if(spl[i].length() > longest) {
                longest = spl[i].length();
            }
        }
        return longest;
    }
    public static void main(String[] args) {
        System.out.println(findLongest("The quick white fox jumped around the massive dog"));
        System.out.println(findLongest("Take me to tinseltown with you"));
        System.out.println(findLongest("Sausage chops"));
        System.out.println(findLongest("Wind your body and wiggle your belly"));
        System.out.println(findLongest("Lets all go on holiday"));
    }
}
//    public static int findLongest(final String str) {
//        return Arrays.stream(str.split(" ")).mapToInt(String::length).max().getAsInt();
//    }