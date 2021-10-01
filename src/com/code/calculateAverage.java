package com.code;

public class calculateAverage {
    public static double find_average(int[] array){
        double total = 0;

        for(int i=0; i<array.length; i++){
            total = total + array[i];
        }


        /* arr.length returns the number of elements
         * present in the array
         */
        double average = total / array.length;
        return average;
    }

    public static void main(String[] args) {
        System.out.println(find_average(new int[]{1,1,1}));
        System.out.println(find_average(new int[]{1, 2, 3}));
    }
}
