package com.code;

public class dalmatiansSquashTheBugs {

        public static String howManyDalmatians(int number){

            String[] dogs = {"Hardly any", "More than a handful!", "Woah that's a lot of dogs!", "101 DALMATIANS!!!"};

            String respond = number <= 10 ? dogs[0] : number <= 50 ? dogs[1] : number == 101 ? dogs[3] : dogs[2];

            return respond;

        }
    public static void main(String[] args) {
        System.out.println(howManyDalmatians(26));
        System.out.println(howManyDalmatians(8));
        System.out.println(howManyDalmatians(14));
        System.out.println(howManyDalmatians(80));
        System.out.println(howManyDalmatians(100));
        System.out.println(howManyDalmatians(101));
    }
}
