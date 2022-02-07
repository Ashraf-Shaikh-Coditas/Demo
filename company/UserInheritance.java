package com.company;

public abstract class UserInheritance {
    public enum status {active,inactive,probation};
    public String firstName;
    public String lastName;
    public boolean verified=false;
    public status status;

    public abstract void sayHello() ;
}
