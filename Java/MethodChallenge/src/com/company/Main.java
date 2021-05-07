package com.company;

public class Main {
    public static void main(String[] args) {
        int Tim = 1500, Bob = 900, Jay = 400, W = 50;
        calculateHighScorePosition(Tim);
        displayHighScorePosition("Tim ",  calculateHighScorePosition(Tim));

        calculateHighScorePosition(Bob);
        displayHighScorePosition("Bob ",  calculateHighScorePosition(Bob));

        calculateHighScorePosition(Jay);
        displayHighScorePosition("Jay ",  calculateHighScorePosition(Jay));

        calculateHighScorePosition(W);
        displayHighScorePosition("W ",  calculateHighScorePosition(W));
    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name+ "managed to get into position"+ position +" on the high score table");
    }

    public static int calculateHighScorePosition(int score){
        if(score>1000) return 1;
        else if(score>500&& score<1000) return 2;
        else if(score>100&& score<500) return 3;
        else return 4;
    }
}
