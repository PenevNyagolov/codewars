package com.code;

public class correctTheMistakesOfTheCharacterRecognitionSoftware {
    public static String correct(String string) {

        return string.replace("I","1").replace("S","5").replace("O","0");

    }

    public static void main(String[] args) {

        System.out.println(correct("IF-RUDYARD KIPLING"));
        System.out.println(correct("ROBERT MERLE - THE DAY OF THE DOLPHIN"));
        System.out.println(correct("RICHARD P. FEYNMAN - THE FEYNMAN LECTURES ON PHYSICS"));
        System.out.println(correct("RICHARD P. FEYNMAN - STATISTICAL MECHANICS"));
        System.out.println(correct("STEPHEN HAWKING - A BRIEF HISTORY OF TIME"));
        System.out.println(correct("STEPHEN HAWKING - THE UNIVERSE IN A NUTSHELL"));
        System.out.println(correct("ERNEST HEMINGWAY - A FARWELL TO ARMS"));
        System.out.println(correct("ERNEST HEMINGWAY - FOR WHOM THE BELL TOLLS"));
        System.out.println(correct("ERNEST HEMINGWAY - THE OLD MAN AND THE SEA"));
        System.out.println(correct("J. R. R. TOLKIEN - THE LORD OF THE RINGS"));
        System.out.println(correct("J. D. SALINGER - THE CATCHER IN THE RYE"));
        System.out.println(correct("J. K. ROWLING - HARRY POTTER AND THE PHILOSOPHER'S STONE"));

    }
}
