package chapter1;
// check if a number is even or odd. If even, print hello, if odd print bye

import java.util.Scanner;

public class IfElseExamples {
    public static void main(String[] args) {
        int n;
        System.out.println("Please enter a number");
        Scanner scanner = new Scanner(System.in);
        n=scanner.nextInt();
        scanner.close();
        if(n%2==0){
            System.out.println("Hello");
                    }else System.out.println("Bye");
    }
}
