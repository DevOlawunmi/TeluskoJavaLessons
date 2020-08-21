package oop;

import java.util.ArrayList;
import java.util.List;

public class CustomTypeListInLoop {
    public static void main(String[] args) {
        String[] firstNames = {"Yolanda","Yvonne", "Yemi", "Yori"};
        String[] lastNames  = { "Okereke", "Orji", "Adegoke", "Adewusi"};
        List<User> myYNames = new ArrayList<>();
        for (int i = 0; i < firstNames.length; i++) {
            User u = new User(); //create a new user
            u.setFirstName(firstNames[i]);// set the current iteration of i as u's first name
            u.setLastName(lastNames[i]);// set the current iteration of i as u's last name
            myYNames.add(u); // add u to the list called myYNames
        }
        for (User u:myYNames
             ) {
            System.out.println(u.getFullName());

        }
        CustomTypeListInLoop ctl = new CustomTypeListInLoop();
        ctl.printUser(myYNames.get(1));
    }

    // to create a method that takes custom list as argument
    public void printUser(User u){
        System.out.println("This is from the print user method: " + u.getFullName());
    }

}
