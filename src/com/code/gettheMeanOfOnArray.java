package com.code;

public class gettheMeanOfOnArray {
    public static int getAverage(int[] marks){
        int total = 0;
        for(int i = 0; i < marks.length; i++){
            total += marks[i];
        }
        return (int)Math.floor(total / marks.length);
    }

    public static void main(String[] args) {
        System.out.println(getAverage(new int[] {2,2,2,2}));
        System.out.println(getAverage(new int[] {1,2,3,4,5}));
        System.out.println(getAverage(new int[] {1,1,1,1,1,1,1,2}));
    }
}
