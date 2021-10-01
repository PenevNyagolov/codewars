package com.code;

public class smallestUnusedID {
    public static int nextId(int[] ids) {
        int minId = 0;
        for (int i = 0; i < ids.length;) {
            if (minId == ids[i]) {
                minId += 1;
                i = 0;
            } else {
                i++;
            }
        }
        return minId;
    }

    public static void main(String[] args) {
        System.out.println(nextId(new int[] { 0, 1, 2, 3, 5 }));
        System.out.println(nextId(new int[] { 1, 2, 0, 2, 3 }));
        System.out.println(nextId(new int[] { 1, 2, 0, 2, 3, 5 }));
        System.out.println(nextId(new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }));

    }
}
//    public void fixedTests() {
//        assertEquals(4, Kata.nextId(new int[] { 0, 1, 2, 3, 5 }));
//        assertEquals(4, Kata.nextId(new int[] { 1, 2, 0, 2, 3 }));
//        assertEquals(4, Kata.nextId(new int[] { 1, 2, 0, 2, 3, 5 }));
//        assertEquals(11, Kata.nextId(new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }));
//    }