package com.code;

public class findSmallestIntegerInArray {
    public static void main(String[] args) {
        System.out.println(findSmallestInt(new int[]{78, 56, 232, 12, 11, 43}));
    }
    public static int findSmallestInt(int[] args) {

        int smallest = Integer.MAX_VALUE;
        for (int number : args)
            if (number < smallest)
            { smallest = number; }


        return smallest;
//Arrays.sort(args);
        //return args[0];
    }
}
