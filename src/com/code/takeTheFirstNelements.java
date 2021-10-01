package com.code;

import java.util.Arrays;

public class takeTheFirstNelements {
    public static int[] take(int[] arr, int n) {

        if (arr.length == 0) return arr;
        if (n > arr.length) return arr;

        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr2[i] = arr[i];
        }
        return arr2;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(take(new int[]{0, 1, 2, 3, 5, 8, 13}, 3)));
    }
}
