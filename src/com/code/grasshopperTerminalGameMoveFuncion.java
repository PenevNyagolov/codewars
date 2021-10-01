package com.code;

public class grasshopperTerminalGameMoveFuncion {
    public static int move(int position, int roll) {
        return position + (roll * 2);
    }

    public static void main(String[] args) {
        System.out.println(move(0, 4));
        System.out.println(move(3, 6));
        System.out.println(move(2, 5));
    }
}
