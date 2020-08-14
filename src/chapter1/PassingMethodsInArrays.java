package chapter1;

public class PassingMethodsInArrays {
    public static void main(String[] args) {
        int[]bucky = {23, 14, 18, 22, 34};
        change(bucky); // we've called the change method on bucky therefore all the elements have been increased by 1
        //below, we print out all the elements 
        for (int y:bucky)
            System.out.println(y);

    }
//Here I'm creating another method called change, which takes an array parameter
    // this method adds 5 to each element in the array
    public static void change(int[] x){
        for(int counter = 0; counter< x.length; counter++)
            x[counter]+=5; // as you loop through, add 5 to the current value of counter
    }
}
