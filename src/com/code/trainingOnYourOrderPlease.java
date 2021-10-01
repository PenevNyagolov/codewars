package com.code;

//Your task is to sort a given string. Each word in the string will contain a single number.
//        This number is the position the word should have in the result.
//
//        Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).
//
//        If the input string is empty, return an empty string. The words in the input
//        String will only contain valid consecutive numbers.
//
//        Examples
//        "is2 Thi1s T4est 3a"  -->  "Thi1s is2 3a T4est"
//        "4of Fo1r pe6ople g3ood th5e the2"  -->  "Fo1r the2 g3ood 4of th5e pe6ople"
//        ""  -->  ""
public class trainingOnYourOrderPlease {
    public static void main(String[] args) {
        System.out.println(order("is2 Thi1s T4est 3a"));
    }
    public static String order(String words) {
        if (words == "")
            return "";
        String[] sort = words.split(" ");
        String output = "";
        for (int i = 0; i < 10; i++)
            for (String o : sort)
                if (o.contains(Integer.toString(i)))
                    output += o+" ";
        output = output.substring(0, output.length()-1);
        return output;
    }
}
//    String[] array = words.split(" ");
//    String s = "";
//    for (int i = 1; i <= array.length; i++) {
//            for (int j = 0; j < array.length; j++) {
//        if (array[j].contains("" + i)) s += array[j] + " ";
//        }
//        }
//        return s.trim();