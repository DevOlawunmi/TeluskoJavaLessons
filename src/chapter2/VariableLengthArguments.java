package chapter2;

public class VariableLengthArguments {
    public static void main(String[] args) {
        System.out.println(average(2,10,12,20));

    }
// here I'm creating a method that I don't know how many args it will take
    public static int average(int...numbers){
        int total  = 0; // I need a variable total in this method
        for (int x: numbers) // for each number passed in add it to total and update total
            total+=x;
        return total/numbers.length;
    }
}
