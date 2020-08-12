package chapter1;

import java.util.Random;

public class RollADiceExample {
    public static void main(String[] args) {
        Random dice  = new Random();
        int diceOutput;
        //I'm going to roll the dice 10 times
        for (int counter = 1; counter<=10;counter++){
            diceOutput = 1 + dice.nextInt(6);
            System.out.println(diceOutput);
        }
    }
}
