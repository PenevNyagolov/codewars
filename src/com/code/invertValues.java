package com.code;

import java.util.Arrays;

//Given a set of numbers, return the additive inverse of each. Each positive becomes negatives,
//        and the negatives become positives.
//
//        invert([1,2,3,4,5]) == [-1,-2,-3,-4,-5]
//        invert([1,-2,3,-4,5]) == [-1,2,-3,4,-5]
//        invert([]) == []
public class invertValues {
    public static int[] invert(int[] array) {

        int[] inverted = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            inverted[i] = -array[i];
        }
        return inverted;
    }

    public static void main(String[] args) {
        int[] input = new int[]{-1, -2, -3, -4, -5};
        System.out.println(Arrays.toString(invert(input)));

        int[] input1 = new int[]{-1, 2, -3, 4, -5};
        System.out.println(invert(input1));

        int[] input2 = new int[]{};
        System.out.println(invert(input2));

        int[] input3 = new int[]{0};
        System.out.println(invert(input3));

    }
}
