package chapter2;

public class Constructors2 {

    private int x; //class variable


    public Constructors2 (int y){
        this.x=y;
    }


public static void main(String[] args){
     Constructors2 myObj = new Constructors2(5);
    System.out.println(myObj.x);
}



}
