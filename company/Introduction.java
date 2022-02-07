package com.company;

import java.util.Scanner;

public class Introduction {

    public static void main(String[] args) {

        System.out.println("What is your name ?");
//      Ashraf
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello "+name);
//          Hello Ashraf


        String string = new String("This is a string ");
        String easier = "Wow that was easier";
        System.out.println(string);
//          This is a string


        int x = 5;
        Integer y = 5;
        System.out.println(x);
        System.out.println(y);
//       5
//       5



    }
}

