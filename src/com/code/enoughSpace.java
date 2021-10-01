package com.code;

public class enoughSpace {
    public static int enough(int cap, int on, int wait) {
        int enoughSpace = on + wait;
        if (cap > enoughSpace){
            return 0;
        }else {
            return Math.abs(cap - (on + wait));
        }
    }

    public static void main(String[] args) {
        System.out.println(enough(10, 5, 5));
        System.out.println(enough(100, 60, 50));
        System.out.println(enough(20, 5, 5));
    }
}
