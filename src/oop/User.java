package oop;

public class User {
    //these are variables available to the User class
    private String firstName;
    public String lastName;

    //we can also create a method for the class
  //  public String output(){
   //    return "Hi, my name is "+firstName +" " +lastName;
  //  }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getFullName(){
        return firstName+" " +lastName;
    }
}
