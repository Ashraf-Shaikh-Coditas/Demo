package com.company;

public class Student extends UserInheritance
        implements Talk {
    public boolean verified = true;

    @Override
    public  void sayHello() {
        System.out.println("Hi I am student "+this.firstName);
    }
}
