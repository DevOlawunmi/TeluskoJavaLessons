package oop;

import java.util.ArrayList;
import java.util.List;

public class CustomTypeListInLoop {
    public static void main(String[] args) {
        String[] firstNames = {"Yolanda","Yvonne", "Yemi", "Yori"};
        String[] lastNames  = { "Okereke", "Orji", "Adegoke", "Adewusi"};
        List<User> myYNames = new ArrayList<>();
        for (int i = 0; i < firstNames.length; i++) {
            User u = new User();
            u.setFirstName(firstNames[i]);// set the current iteration of i as first name
            u.setLastName(lastNames[i]);// set the current iteration of i as last name
            myYNames.add(u);
        }
        for (User u:myYNames
             ) {
            System.out.println(u.getFullName());

        }
    }

}
