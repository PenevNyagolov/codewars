package com.code;

import java.util.Arrays;

public class decodeTheMorseCode {
    public static String decode(String morseCode) {
        String alfa = "";
        String[] morse = morseCode.split(" ");
        for (String a : morse) {
            switch (a){
                case "-----" :
                    alfa += "0";
                    break;
                case ".----" :
                    alfa += "1";
                    break;
                case "..---" :
                    alfa += "2";
                    break;
                case "...--" :
                    alfa += "3";
                    break;
                case "....-" :
                    alfa += "4";
                    break;
                case "....." :
                    alfa += "5";
                    break;
                case "-...." :
                    alfa += "6";
                    break;
                case "--..." :
                    alfa += "7";
                    break;
                case "---.." :
                    alfa += "8";
                    break;
                case "----." :
                    alfa += "9";
                    break;
                case ".-" :
                    alfa += "A";
                    break;
                case "-..." :
                    alfa += "B";
                    break;
                case "-.-." :
                    alfa += "C";
                    break;
                case "-.." :
                    alfa += "D";
                    break;
                case "." :
                    alfa += "E";
                    break;
                case "..-." :
                    alfa += "F";
                    break;
                case "--." :
                    alfa += "G";
                    break;
                case "...." :
                    alfa += "H";
                    break;
                case ".." :
                    alfa += "I";
                    break;
                case ".---" :
                    alfa += "J";
                    break;
                case "-.-" :
                    alfa += "K";
                    break;
                case ".-.." :
                    alfa += "L";
                    break;
                case "--" :
                    alfa += "M";
                    break;
                case "-." :
                    alfa += "N";
                    break;
                case "---" :
                    alfa += "O";
                    break;
                case ".--." :
                    alfa += "P";
                    break;
                case "--.-" :
                    alfa += "Q";
                    break;
                case ".-." :
                    alfa += "R";
                    break;
                case "..." :
                    alfa += "S";
                    break;
                case "-" :
                    alfa += "T";
                    break;
                case "..-" :
                    alfa += "U";
                    break;
                case "...-" :
                    alfa += "V";
                    break;
                case ".--" :
                    alfa += "W";
                    break;
                case "-..-" :
                    alfa += "X";
                    break;
                case "-.--" :
                    alfa += "Y";
                    break;
                case "--.." :
                    alfa += "Z";
                default:
                    alfa += " ";
            }
        }
//        return alfa.replaceAll("\\s+"," ");
        return Arrays.toString(morse);
    }
    public static void main(String[] args) {
        System.out.println(decode(".... . -.--   .--- ..- -.. ."));
//        System.out.println(Arrays.toString(decode()));
    }
}
//    public static String decode(String morseCode) {
//        String[] words = morseCode.trim().replace("   ", "  ").split(" ");
//        String code = "";
//        for(String s : words) {
//            if(!s.equals("")) code += MorseCode.get(s);
//            else code += " ";
//        }
//        return code;
//    }