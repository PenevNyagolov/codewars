package com.code;

import java.util.Arrays;

public class myHeadIsAtTheWrongEnd {
    public static String[] fixTheMeerkat(String[] arr) {
//        String[] a = new  String[arr.length - 1];
        String[] a = new String[]{arr[2],arr[1],arr[0]};
        return a;
//        return null;
    }
    public static void main(String[] args) {

        String[] b = {"heads", "body", "tails"};
        System.out.println(Arrays.toString(fixTheMeerkat(b)));
        System.out.println(fixTheMeerkat(new String[]{ "top", "middle", "bottom" }));
        System.out.println(fixTheMeerkat(new String[]{ "upper legs", "torso", "lower legs"}));
        System.out.println(fixTheMeerkat(new String[]{ "sky", "rainbow", "ground" }));
    }
}
