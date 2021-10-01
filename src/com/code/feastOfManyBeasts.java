package com.code;

public class feastOfManyBeasts {
    public static boolean feast(String beast, String dish) {

        String shou = beast.substring(0, 1);
        String shou2 = dish.substring(0, 1);
        String wei = beast.substring(beast.length() - 1, beast.length());
        String wei2 = dish.substring(dish.length() - 1, dish.length());
        if (shou.equals(shou2) && wei.equals(wei2)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(feast("great blue heron","garlic nann"));
        System.out.println(feast("chickadee","chocolate cake"));
        System.out.println(feast("brown bear","bear claw"));
    }
}
