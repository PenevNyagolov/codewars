package com.code;

public class keepUpTheHoop {
    public static String hoopCount(int n){
        if(n < 10){
            return "Keep at it until you get it";
        }else{
            return "Great, now move on to tricks";
        }
    }

    public static void main(String[] args) {
        System.out.println(hoopCount(11));
        System.out.println(hoopCount(7));
    }
}
