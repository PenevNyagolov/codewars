package com.code;

public class DNAtoRNA {
    public static String dnaToRna(String dna) {
        return dna.replaceAll("T", "U");
    }
    public static void main(String[] args) {

        System.out.println(dnaToRna("TTTT"));
        System.out.println(dnaToRna("GCAT"));
    }
}
