package com.company;

import java.util.List;

public class User {
    private String firstName;
    private String lastName;

    public String getFullName() {
        return firstName+" "+lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String name) {
        firstName = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String name) {
        lastName = name;
    }

    public static void printUser(User u) {
        System.out.println(u.getFullName());
    }

    public static void displayUsers(List<User> list) {
        for(User u : list) {
            System.out.println(u.getFullName());
        }
    }

    public static int searchList(List<User> users , String fullname) {
        for(int i=0;i<users.size();i++) {
            if(users.get(i).getFullName().equals(fullname))
                return i;
        }
        return -1;
    }

    public static int searchList(List<User> users , String firstName,String lastName) {
        String fullname =firstName+" "+lastName;
        int result = searchList(users,fullname);
        return result;
    }

    @Override
    public String toString() {
        return this.getFullName();
    }

    public static User searchUser(List<User> list ,User u) {
        for(User user : list) {
            if(user.equals(u)) {
                return user;
            }
        }
        return null;
    }
}

/*

* */
