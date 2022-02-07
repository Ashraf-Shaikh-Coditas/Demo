package com.company;

public class Teacher extends UserInheritance implements Talk{
    @Override
    public  void sayHello() {
        System.out.println("Hi I am Teacher "+this.firstName);
    }
}
