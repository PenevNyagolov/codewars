package com.code;

public class findTheFirstNonConsentiveNumber {
    public static Integer find(final int[] array) {
        Integer prev = array[0];
        Integer first = null;
        for (Integer i = 1; i < array.length; i++) {
            if ((prev + 1) != array[i]) {
                first = array[i];
                break;
            }
            prev ++;
        }
        return first;
    }

    public static void main(String[] args) {
        System.out.println(find(new int[]{1, 2, 3, 4, 6, 7, 8}));
        System.out.println(find(new int[]{1, 2, 3, 4, 5, 6, 7, 8}));
        System.out.println(find(new int[]{4, 6, 7, 8, 9, 11}));
        System.out.println(find(new int[]{4, 5, 6, 7, 8, 9, 11}));
        System.out.println(find(new int[]{31, 32}));
        System.out.println(find(new int[]{-3, -2, 0, 1}));
    }
}
