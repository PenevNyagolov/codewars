package com.code;
//Given an array of integers your solution should find the smallest integer.
//
//        For example:
//
//        Given [34, 15, 88, 2] your solution will return 2
//        Given [34, -345, -1, 100] your solution will return -345
//        You can assume, for the purpose of this kata, that the supplied array will not be empty.
public class findTheSmallestIntegers {
    public static int findSmallestInt(int[] args) {
        int min = args[0];
        for (int i = 0; i < args.length; i++) {
             if (args[i] < min){
                 min = args[i];
             }
        }
        return min;
    }
    public static void main(String[] args) {
        System.out.println(findSmallestInt(new int[]{78,56,232,12,11,43}));
        System.out.println(findSmallestInt(new int[]{78,56,-2,12,8,-33}));
        System.out.println(findSmallestInt(new int[]{0,Integer.MIN_VALUE,Integer.MAX_VALUE}));

    }
}

//        Arrays.sort(args);
//        return args[0];
