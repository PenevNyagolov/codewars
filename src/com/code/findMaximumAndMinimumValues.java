package com.code;

public class findMaximumAndMinimumValues {
    public static int min(int[] list) {
        int minValue = list[0];
        for(int i = 1;i < list.length;i++){
            if(list[i] < minValue){
                minValue = list[i];
            }
        }
        return minValue;
    }

    public static int max(int[] list) {
        int maxValue = list[0];
        for(int i = 1;i < list.length;i++){
            if(list[i] > maxValue){
                maxValue = list[i];
            }
        }
        return maxValue;
    }

    public static void main(String[] args) {
        int[] listMin = {-52, 56, 30, 29, -54, 0, -110};
        int[] listMin1 = {42, 54, 65, 87, 0};
        int[] listMax = {4,6,2,1,9,63,-134,566};
        int[] listMax1 = {5};
        System.out.println(min(listMin));
        System.out.println(min(listMin1));
        System.out.println(max(listMax));
        System.out.println(max(listMax1));
    }
}
