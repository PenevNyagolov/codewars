package com.code;

public class getNthEvenNumber {

    public static int nthEven(int n) {
        int number = 0;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < n * 2; i++) {
            if (i % 2 == 0){
//                if (i == n){
                    builder.append(number = i);
//                }
            }
        }
        return number;
//        return 2 * n - 2;
    }

    public static void main(String[] args) {
        System.out.println(nthEven(1));
        System.out.println(nthEven(2));
        System.out.println(nthEven(3));
        System.out.println(nthEven(100));
        System.out.println(nthEven(1298734));
    }
}
