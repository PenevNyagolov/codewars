package com.code;

public class grasshopperGradeBook {
    public static char getGrade(int s1, int s2, int s3) {

        float score = (s1 + s2 + s3) / 3;
        if (score >= 90 && score <= 100) {
            return 'A';
        } else if (score >= 80 && score < 90) {
            return 'B';
        } else if (score >= 70 && score < 80) {
            return 'C';
        } else if (score >= 60 && score < 70) {
            return 'D';
        } else {
            return 'F';
        }
    }

    public static void main(String[] args) {
        System.out.println(getGrade(70,70,100));
        System.out.println(getGrade(82,85,87));
        System.out.println(getGrade(84,79,85));
        System.out.println(getGrade(70,70,70));
        System.out.println(getGrade(75,70,79));
        System.out.println(getGrade(60,82,76));
        System.out.println(getGrade(65,70,59));
        System.out.println(getGrade(66,62,68));
        System.out.println(getGrade(58,62,70));
        System.out.println(getGrade(44,55,52));
        System.out.println(getGrade(48,55,52));
        System.out.println(getGrade(58,59,60));
        System.out.println(getGrade(0,0,0));

    }

}


