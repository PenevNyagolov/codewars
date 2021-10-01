package com.code;

public class convertBooleaValuesToStringYesOrNo {
    public static String boolToWord(boolean b)
    {
        if (b == true){
            return "Yes";
        }else {
            return "No";
        }
    }

    public static void main(String[] args) {
        System.out.println(boolToWord(true));
        System.out.println(boolToWord(false));
    }
}
