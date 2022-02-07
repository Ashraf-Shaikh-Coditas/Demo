package com.company;

import java.util.ArrayList;
import java.util.List;

public class UserInheritanceMain {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.firstName="Ashraf";
        s1.lastName="Shaikh";

        s1.sayHello();
//      Hello my name is Ashraf

        s1.sayHello();
//      Hello my name is Ashraf

        Teacher t1 = new Teacher();
        t1.firstName = "XYZ";
        t1.lastName = "Teacher";

        List<UserInheritance> users = new ArrayList<>();
        users.add(s1);
        users.add(t1);
        for(UserInheritance u : users) {
            u.sayHello();
        }
        //Hi I am student Ashraf
        //Hi I am Teacher XYZ

        s1.status = s1.status.probation;
        System.out.println(s1.status);
//        probation

        switch (s1.status) {
            case probation :
                System.out.println("Sorry");
                break;
            case active:
                System.out.println("Great!");
                break;
            case inactive:
                System.out.println("Come back");
                break;
        }

//     Sorry


    }
}
