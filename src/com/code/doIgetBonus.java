package com.code;

public class doIgetBonus {
    public static String bonusTime(final int salary, final boolean bonus) {
        if (bonus == true) {
            return "£" + salary * 10;
        } else {
            return "£" + salary;
        }
    }

    public static void main(String[] args) {
        System.out.println(bonusTime(10000, true));
        System.out.println(bonusTime(25000, true));
        System.out.println(bonusTime(10000, false));
    }
}
