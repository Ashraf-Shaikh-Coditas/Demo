package com.company;

import java.util.ArrayList;
import java.util.List;



public class UserMain {
    public static void main(String[] args) {
        User user1 = new User();
        User user2 = new User();
//        user1.set="Ashraf ";
//        user1.lastName="Shaikh ";

        user1.setFirstName("Ashraf");
        user1.setLastName("Shaikh");
        user2.setFirstName("Aman");
        user2.setLastName("Shaikh");

        System.out.println(user1.getFullName());
        System.out.println(user1.getFirstName()+"  "+ user1.getLastName());
//      Ashraf Shaikh
//      Ashraf Shaikh

        List<User> users = new ArrayList<User>();
        users.add(user1);
        users.add(user2);
        System.out.println(users.get(1).getFullName());
//      Aman Shaikh

        User.printUser(user1);
//       Ashraf Shaikh

        User.displayUsers(users);
//      Ashraf Shaikh
//      Aman Shaikh

        System.out.println(User.searchList(users,"Aman Shaikh"));
        System.out.println(User.searchList(users,"XYX"," Shaikh"));
        System.out.println(user1.toString());
//      1
//      -1
//      Ashraf Shaikh


        if(User.searchUser(users,user1)!=null) {
            System.out.println("User exists");
        } else {
            System.out.println("User not found");
        }
//      User exists




    }
}

