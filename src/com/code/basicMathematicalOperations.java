package com.code;

public class basicMathematicalOperations {
    public static Integer basicMath(String op, int v1, int v2)
    {
        if (op.equals("+")){
            return v1 + v2;
        }else if (op.equals("-")){
            return v1 - v2;
        }else if (op.equals("*")){
            return v1 * v2;
        }else {
            return v1 / v2;
        }
    }

    public static void main(String[] args) {
        System.out.println(basicMath("+", 4, 7));
        System.out.println(basicMath("-", 15, 18));
        System.out.println(basicMath("*", 5, 5));
        System.out.println(basicMath("/", 49, 7));
    }
}
