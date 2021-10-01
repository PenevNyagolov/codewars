package com.code;

import java.util.List;

//Given an array of integers as strings and numbers, return the sum
//        of the array values as if all were numbers.
//        Return your answer as a number.
public class sumMixedArray {
    public int sum(List<?> mixed) {
        int sum = 0;

        for (Object element : mixed) {
            if (element instanceof Integer) {
                sum += (Integer) element;
            } else if (element instanceof String) {
                sum += Integer.parseInt( (String) element );
            }
        }
        return sum;
    }
    public static void main(String[] args) {

//        System.out.println(sum(Arrays.asList(5,"5")));
//        System.out.println(sum(Arrays.asList(9, 3, "7", "3")));
//        System.out.println(sum(Arrays.asList("5", "0", 9, 3, 2, 1, "9", 6, 7)));
//        System.out.println(sum(Arrays.asList("3", 6, 6, 0, "5", 8, 5, "6", 2, "0")));
//        System.out.println(sum(Arrays.asList("1", "5", "8", 8, 9, 9, 2, "3")));
//        System.out.println(sum(Arrays.asList("3", 6, 6, 0, "5", 8, 5, "6", 2, "0")))
//        System.out.println(sum(Arrays.asList(8, 0, 0, 8, 5, 7, 2, 3, 7, 8, 6, 7)));
//        return mixed.stream().mapToInt(o -> Integer.parseInt(o.toString())).sum();
    }
}
