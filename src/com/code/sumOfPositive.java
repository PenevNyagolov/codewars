package com.code;

public class sumOfPositive {
    public static int sum(int[] arr){
        int sum = 0;
        for(var i = 0; i < arr.length; i++) {
            if(arr[i] > 0) {
                sum += arr[i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(new int[]{1,2,3,4,5}));
        System.out.println(sum(new int[]{1,-2,3,4,5}));
        System.out.println(sum(new int[]{}));
        System.out.println(sum(new int[]{-1,-2,-3,-4,-5}));
        System.out.println(sum(new int[]{-1,2,3,4,-5}));

    }
}
