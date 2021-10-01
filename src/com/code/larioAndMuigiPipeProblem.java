package com.code;

import java.util.Arrays;

public class larioAndMuigiPipeProblem {
    public static int[] pipeFix(int[] numbers) {
        int min = numbers[0];
        int max = numbers[numbers.length - 1];
        int size = max - min + 1;
        int[] result = new int[size];
        for (int i = 0; i < size; i++){
            result[i] = i + min;
        }
        return result;
//        return IntStream.range(numbers[0], numbers[numbers.length - 1] + 1).toArray();
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(pipeFix(new int[] {1,2,3,5,6,8,9})));
//        assertArrayEquals(new int[] {1,2,3,4,5,6,7,8,9,10,11,12}, Kata.pipeFix(new int[] {1,2,3,12}));
//        assertArrayEquals(new int[] {6,7,8,9}, Kata.pipeFix(new int[] {6,9}));
//        assertArrayEquals(new int[] {-1,0,1,2,3,4}, Kata.pipeFix(new int[] {-1,4}));
//        assertArrayEquals(new int[] {1,2,3}, Kata.pipeFix(new int[] {1,2,3}));

    }
}
