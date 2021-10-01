package com.code;

public class NthPower {
    public static int nthPower(int[] array, int n) {
        if (array.length <= n || 0 > n) {
            return -1;
        } else {
            return (int) Math.pow(array[n], n);
        }
    }

    public static void main(String[] args) {
        System.out.println(nthPower(new int[]{1, 2}, 2));
        System.out.println(nthPower(new int[]{3, 1, 2, 2}, 3));
        System.out.println(nthPower(new int[]{3, 1, 2}, 2));
    }
}
//public void basicTests() {
//        assertEquals(-1, Kata.nthPower(new int[] {1,2}, 2));
//        assertEquals(8, Kata.nthPower(new int[] {3,1,2,2}, 3));
//        assertEquals(4, Kata.nthPower(new int[] {3,1,2}, 2));
//        }