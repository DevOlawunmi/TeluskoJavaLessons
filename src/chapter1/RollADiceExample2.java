package chapter1;
/*
1. Roll the dice 100 times
2. Count how many times each face occurs
3. Display the result in a table
 */

import java.util.Random;

public class RollADiceExample2 {
    public static void main(String[] args) {

        Random random = new Random();
        // we want to hold several values together therefore we'll need an array
        int[] frequency = new int[7]; // so we have frequency 1, freq2 to 6 all set to 0 to begin with

        // to roll the dice a thousand times

        for (int counter = 1; counter <=1000; counter++) //I'll start from one and repeat 100 times

        {
++frequency[1+random.nextInt(6)];//whatever number is generated, update their frequency.
            //remember each number's frequency started at 0
// Only generate numbers between 0 and 5 and then add one to it

        }
        System.out.println("Face \t Frequency"); // display the table header
        for (int face = 1; face<frequency.length; face++)
            System.out.println(face +"\t"+ frequency[face]);// display the face and the frequency of each face
    }
}