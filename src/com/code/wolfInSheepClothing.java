package com.code;

public class wolfInSheepClothing {
    public static String warnTheSheep(String[] array) {
        int counter = 0;
        for (int i = array.length - 1; i >= 0; i--) {

            counter++;
//        }
            if (array[array.length - 1] == "wolf") {
                return "Pls go away and stop eating my sheep";
            } else if (array[i].equals("wolf")) {
                // let index = queue.findIndex( (x) => x == 'wolf' );
                return "Oi! Sheep number " + (counter - 1) + "! You are about to be eaten by a wolf!";
            }
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(warnTheSheep(new String[]{"sheep", "sheep", "sheep", "sheep", "sheep", "wolf", "sheep", "sheep"}));
        System.out.println(warnTheSheep(new String[]{"sheep", "wolf", "sheep", "sheep", "sheep", "sheep", "sheep"}));
        System.out.println(warnTheSheep(new String[]{"wolf", "sheep", "sheep", "sheep", "sheep", "sheep", "sheep"}));
        System.out.println(warnTheSheep(new String[]{"sheep", "wolf", "sheep"}));
        System.out.println(warnTheSheep(new String[]{"sheep", "sheep", "wolf"}));
//    }
//}
    }
}
