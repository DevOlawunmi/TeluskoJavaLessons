package chapter1;

public class PassingMethodsInArrays {
    public static void main(String[] args) {
        int[]bucky = {23, 14, 18, 22, 34};
        change(bucky);
        for (int y:bucky)
            System.out.println(y);

    }

    public static void change(int x[]){
        for(int counter = 0; counter< x.length; counter++)
            x[counter]+=5;
    }
}
