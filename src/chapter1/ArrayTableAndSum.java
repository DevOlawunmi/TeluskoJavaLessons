package chapter1;

public class ArrayTableAndSum {
    public static void main(String[] args) {
//        System.out.println("Index\tValue");// my table headers
        int[] olaGrades = {89, 95, 94, 88, 91, 97};
//        for(int i = 0;i<olaGrades.length;i++)
//            System.out.println(i + "\t" + olaGrades[i]);


        // to add all the numbers in the array, we'll need a variable sum

        int sum = 0;
        for (int counter  = 0; counter<olaGrades.length; counter++)
            sum+=olaGrades[counter];
        System.out.println(sum);

    }

}
