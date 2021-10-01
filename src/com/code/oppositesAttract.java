package com.code;

public class oppositesAttract {
    public static boolean isLove(final int flower1, final int flower2) {
         int flower = flower1 + flower2;
         if (flower % 2 == 0){
             return false;
         }else {
             return true;
         }
    }

    public static void main(String[] args) {

        System.out.println(isLove(1, 4));
        System.out.println(isLove(2, 2));
        System.out.println(isLove(1, 1));
        System.out.println(isLove(0, 1));

    }
}
