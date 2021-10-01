package com.code;

public class thinkfulLogicDrillsTrafficLight {
    public static String updateLight(String current) {

        switch (current) {
            case "green" :
                return "yellow";
            case "yellow" :
                return "red";
            case "red" :
                return "green";
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(updateLight("red"));
        System.out.println(updateLight("green"));
        System.out.println(updateLight("yellow"));
    }
}
