package com.code;

public class cantSleepJustCountSheep {
    public static void main(String[] args) {
        System.out.println(countingSheep(1));
        System.out.println(countingSheep(2));
        System.out.println(countingSheep(3));

    }
    public static String countingSheep(int num) {
        String sheep = "";
        for (int i = 1; i <= num; i++) {
            sheep += i + " " + "sheep...";
        }
        return sheep;
    }
}
