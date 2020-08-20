package oop;
//fields are class level variables

public class MySweetRunner {
    public static void main(String[] args) {
User user1 = new User();
//user1.firstName = "Dolly";
//user1.lastName = "Parton";
//user1.output(); // calling the output method on the user1 object
 //       String message = user1.output();
 //       System.out.println(message);

        // now that we have getters and setters

        user1.setFirstName("Dolly");
        user1.setLastName("Parton");
        System.out.println(user1.getFirstName());
        System.out.println(user1.getFullName());
    }
}
