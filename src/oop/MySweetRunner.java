package oop;
//fields are class level variables

import java.util.ArrayList;
import java.util.List;

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

        User user2 = new User();
        user2.setFirstName("Brad");
        user2.setLastName("Paisley");
      //  System.out.println(user1.getFirstName());
      //  System.out.println(user1.getFullName());

            //To create a custom type list. Create the users which we already did, 2, add them to list
        List<User>users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        System.out.println(users.get(1).getFullName());

    }

}
