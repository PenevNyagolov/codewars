package com.code;

public class centuryFromYear {
    public static int century(int number) {
        if (number <= 100){
            return 1;

        }else if (number % 100 == 0){
            return number / 100;

        }else{
            return number / 100 + 1;
        }
    }

    public static void main(String[] args) {
        System.out.println(century(1705));
        System.out.println(century(1900));
        System.out.println(century(1601));
        System.out.println(century(2000));
        System.out.println(century(89));
    }
}
