package chapter2;

/*
A constructor in Java is a special method that is used to initialize objects.
The constructor is called when an object of a class is created.
It can be used to set initial values for object attributes:
eg Scanner scanner  = new Scanner(System.in)
We can build multiple constructors but only one of them can have the same name as the class
All classes have constructors by default: if you do not create a class constructor yourself, Java creates one for you.
However, then you are not able to set initial values for object attributes.


// Create a MyClass class
public class MyClass {
  int x;  // Create a class attribute

  // Create a class constructor for the MyClass class
  public MyClass() {
    x = 5;  // Set the initial value for the class attribute x
  }

  public static void main(String[] args) {
    MyClass myObj = new MyClass(); // Create an object of class MyClass (This will call the constructor)
    System.out.println(myObj.x); // Print the value of x
  }
}

// Outputs 5
 */
public class JavaConstructors {
}
