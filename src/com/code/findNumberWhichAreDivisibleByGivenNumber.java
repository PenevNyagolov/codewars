package com.code;

import java.util.Arrays;

public class findNumberWhichAreDivisibleByGivenNumber {
    public static int[] divisibleBy(int[] numbers, int divider) {
        int count = 0;
        for (int number : numbers) {
            if (number % divider == 0) {
                count++;
            }
        }
        int[] arr = new int[count];
        int i = 0;
        for (int number : numbers) {
            if (number % divider == 0) {
                arr[i] = number;
                i++;
            }
        }
        return arr;
//        return Arrays.stream(numbers).filter(i -> (i % divider) == 0).toArray();
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(divisibleBy(new int[]{1, 2, 3, 4, 5, 6}, 2)));
        System.out.println(divisibleBy(new int[]{1, 2, 3, 4, 5, 6}, 3));
        System.out.println(divisibleBy(new int[]{0, 1, 2, 3, 4, 5, 6}, 4));
    }
}
