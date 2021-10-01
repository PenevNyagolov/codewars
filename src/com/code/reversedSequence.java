package com.code;

public class reversedSequence {
    public static int[] reverse(int n){
        int seq[] = new int[n];
        for (int i = 0; i < n; i++) {
            seq[i] = n - i;
        }
        return seq;
    }

    public static void main(String[] args) {
        System.out.println(reverse(5));
    }
}
