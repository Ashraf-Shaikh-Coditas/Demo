package com.company;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        System.out.println("How old are you");

        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("cats or dogs ?");
        String animal = scanner.nextLine();

        if(age >12 && animal.equals("dogs")) {
            System.out.println("Welcome ");
        }

        if(age>12 || animal.equals("cats")){
            System.out.println("Please come");
        }

        System.out.println("What is your name");
        String name = scanner.nextLine();

//      How old are you
//      13
//      cats or dogs ?
//      cats
//      Please come

        switch (name) {
            case  "Ashraf" :
                System.out.println("Your name is "+name);
                break;
            case  "Aman" :
                System.out.println("Your name is "+name);
                break;
            default:
                System.out.println("You are not having any name");
                break;
        }

//      What is your name
//      Ashraf
//      Your name is Ashraf



        String s1 = "claer";
//        boolean welcome = s1.equals("claer") ? true : false;
        boolean welcome;
        if(s1.equals("claer")) {
             welcome = true;
        } else {
             welcome = false;
        }
        System.out.println(welcome);
    }
}



//      true


