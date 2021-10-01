package com.code;

import java.util.Arrays;

//Complete the function that takes two integers (a, b, where a < b)
//        and return an array of all integers between the input parameters,
//        including them.
//
//        For example:
//
//        a = 1
//        b = 4
//        --> [1, 2, 3, 4]
public class whatIsBetween {
    public static int[] between(int a, int b) {

            int[] arr = new int[b-a+1];
            int c = a;
            for (int i = 0; i < arr.length; i++) {
                arr[i] += c;
                c++;
            }
            return arr;
//        return IntStream.rangeClosed(a,b).toArray();
    }
    public static void main(String[] args) {
//        for (int i = -2; i <= 2; i++) {
//            System.out.println(i);
//        }
        System.out.println(Arrays.toString(between(1, 4)));
        System.out.println(Arrays.toString(between(-2, 2)));
    }
}
