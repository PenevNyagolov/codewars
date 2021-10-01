package com.code;

public class beginnerReduceButGrow {
    public static int grow(int[] x){

        int multiplication = 1;

        for (int i = 0; i < x.length; i++)
        {
            multiplication = multiplication * x[i];
        }
        return multiplication;
    }

    public static void main(String[] args) {
        System.out.println(grow(new int[]{1,2,3}));
        System.out.println(grow(new int[]{4,1,1,1,4}));
        System.out.println(grow(new int[]{2,2,2,2,2,2}));

    }
}
