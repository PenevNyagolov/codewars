package com.code;

public class grasshopperMessiGoals {
    public static int laLigaGoals;
    public static int championsLeagueGoals;
    public static int copaDelReyGoals;

    public static int totalGoals;
    public static int getTotalGoals(int laLigaGoals,int championsLeagueGoals,int copaDelReyGoals) {
        totalGoals = laLigaGoals + championsLeagueGoals + copaDelReyGoals;

        return totalGoals;
    }

    public static void main(String[] args) {
        System.out.println(getTotalGoals(43,10,5));
    }
}
