package chapter1;

public class MultiDimensionalArrays {
    public static void main(String[] args) {
        int[][] firstArray = {{23,24,25,25,24,45},{34,43,35,36,31}};
        int[][] secondArray = {{51,52,53,54,55,56},{12,13,14},{61,62,63,64,65}};
        System.out.println("This is the first array");
        displayArray(firstArray);
        System.out.println("This is the second array");
        displayArray(secondArray);


    }


    public static void displayArray(int[][]x){
        for(int row = 0; row<x.length; row++){
            for (int column = 0; column<x[row].length;column++){
                System.out.print(x[row][column]+"\t");
            }
            System.out.println();
        }

    }

}
