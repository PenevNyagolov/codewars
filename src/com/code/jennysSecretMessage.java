package com.code;

public class jennysSecretMessage {
    public static String greet(String name) {

        if(name.equals("Johnny"))
        {
            return "Hello, my love!";
        }else{
            return String.format("Hello, %s!", name);
        }
    }

    public static void main(String[] args) {
        System.out.println(greet("Johnny"));
    }
}
