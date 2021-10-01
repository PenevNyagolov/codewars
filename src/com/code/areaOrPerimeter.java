package com.code;

public class areaOrPerimeter {
    public static int areaOrPerimeter(int l, int w) {
        if (l == w) {
            return l * w;
        } else {
            return 2 * (l + w);
        }
    }

    public static void main(String[] args) {
        System.out.println(areaOrPerimeter(4, 4));
        System.out.println(areaOrPerimeter(6, 10));
    }
}

