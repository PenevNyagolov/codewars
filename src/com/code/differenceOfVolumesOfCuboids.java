package com.code;

public class differenceOfVolumesOfCuboids {
    public static void main(String[] args) {
        int[] a = {14,13,1};
        int[] b = {23,15,11};
        System.out.println(findDifference(a,b));
    }
    public static int findDifference(final int[] firstCuboid, final int[] secondCuboid) {
        int a = firstCuboid[0] * firstCuboid[1] * firstCuboid[2];
        int b = secondCuboid[0] * secondCuboid[1] * secondCuboid[2];
        if (a > b){
            return a - b;
        }else {
            return b - a;
        }

    }
}

