package com.code;

public class countSheeps1 {
    public static int countSheeps(Boolean[] arrayOfSheeps) {
        int sheepCounter = 0;
        //loop number of sheep in array
        for( int i = 0; i < arrayOfSheeps.length; i++) {
            //if sheep value is equal to true add one
            if(arrayOfSheeps[i] == Boolean.TRUE) {
                sheepCounter++;
            }
        }
        //return number of sheep
        return sheepCounter;
    }

    public static void main(String[] args) {
        Boolean[] array1 = {true,  true,  true,  false,
                true,  true,  true,  true ,
                true,  false, true,  false,
                true,  false, false, true ,
                true,  true,  true,  true ,
                false, false, true,  true };

        System.out.println(countSheeps(array1));
        }
    }


