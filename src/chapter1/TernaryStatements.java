package chapter1;

import java.util.Scanner;

public class TernaryStatements {
    public static void main(String[] args) {
        int i = 8;
        int j = 0;
//        if(i>6) j=1;
//
//        if (i<6)j=2;

        //we can shorten this code by making it a ternary statement

        System.out.println("Enter a value");
        Scanner scanner = new Scanner(System.in);
        i = scanner.nextInt();
        scanner.close();
        j=i>6?1:2;
        System.out.println(j);
    }
}
