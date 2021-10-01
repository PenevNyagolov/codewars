package com.code;

public class stringyStrings {
    public static String stringy(int size) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < size + 1; i++)
            sb.append(i & 1);
        return sb.toString();

    }

    public static void main(String[] args) {

    }
}
