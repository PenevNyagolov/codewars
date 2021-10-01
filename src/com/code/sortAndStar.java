package com.code;

import java.util.Arrays;

public class sortAndStar {
    public static String twoSort(String[] s) {

        Arrays.sort(s);
        String[] firstWordArray = s[0].split("");
        String result = "";
        for (int i = 0; i < firstWordArray.length; i++) {
            result += firstWordArray[i];
            if (i < firstWordArray.length - 1) {
                result += "***";
            }
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(twoSort(new String[] {"bitcoin", "take", "over", "the", "world", "maybe", "who", "knows", "perhaps"}));
        System.out.println(twoSort(new String[] {"turns", "out", "random", "test", "cases", "are", "easier", "than", "writing", "out", "basic", "ones"}));

    }
}
