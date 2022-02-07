package com.company;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        int i = 0;
        while(i<10) {
            System.out.println("Hello");
            i++;
        }
//      Hello
//      Hello
//      Hello
//      Hello
//      Hello
//      Hello
//      Hello
//      Hello
//      Hello
//      Hello

        System.out.println("Password Please...");
        String password ="let me in";
        Scanner scanner = new Scanner(System.in);
        String guess;
        guess = scanner.nextLine();

        while(!guess.equals(password)) {
            System.out.println("Enter correct password");
            guess=scanner.nextLine();
        }

        System.out.println("Login successfull");
//      Password Please...
//      let
//      Enter correct password
//      let me in
//      Login successfull


        do{
            System.out.println("Guess the password");
            guess = scanner.nextLine();
        } while(!guess.equals(password));

        System.out.println("Congrats");

//      Guess the password
//        let me in
//        Congrats

        for(i=0;i<10;i++) {
            System.out.println(i+1);
        }
//      1
//      2
//      3
//      4
//      5
//      6
//      7
//      8
//      9
//      10

        for(int j=9;j>=0;j--) {
            for(int k=9;k>=0;k--) {
                System.out.print(k+" ");
            }
            System.out.println();
        }
//      9 8 7 6 5 4 3 2 1 0
//      9 8 7 6 5 4 3 2 1 0
//      9 8 7 6 5 4 3 2 1 0
//      9 8 7 6 5 4 3 2 1 0
//      9 8 7 6 5 4 3 2 1 0
//      9 8 7 6 5 4 3 2 1 0
//      9 8 7 6 5 4 3 2 1 0
//      9 8 7 6 5 4 3 2 1 0
//      9 8 7 6 5 4 3 2 1 0
//      9 8 7 6 5 4 3 2 1 0

        for(int j=9;j>=0;j--) {
            for(int k=j;k>=0;k--) {
                System.out.print(k+" ");
            }
            System.out.println();
        }

//      9 8 7 6 5 4 3 2 1 0
//      8 7 6 5 4 3 2 1 0
//      7 6 5 4 3 2 1 0
//      6 5 4 3 2 1 0
//      5 4 3 2 1 0
//      4 3 2 1 0
//      3 2 1 0
//      2 1 0
//      1 0
//      0

    }
}

