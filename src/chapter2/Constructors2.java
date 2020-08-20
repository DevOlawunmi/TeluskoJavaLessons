package chapter2;

public class Constructors2 {

    private int name; //class variable


    public Constructors2 (int y){
        this.name=y;//if we call this constructor, assign the value y to the variable 'name'
    }


public static void main(String[] args){
     Constructors2 myObj = new Constructors2(5);
    System.out.println(myObj.name);
}



}
