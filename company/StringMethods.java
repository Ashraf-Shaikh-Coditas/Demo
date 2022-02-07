package com.company;

import java.util.Locale;
import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        String s = " I have studied at Dr. D Y Patil School of Engineering ";
        System.out.println(s.indexOf("I"));
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());

        System.out.println(s.substring(9));
        System.out.println(s.substring(9,17));


          String password = "let me in";
          Scanner scanner = new Scanner(System.in);
          String guess = scanner.nextLine();
          System.out.println(password.equals(guess));
          System.out.println(password==(guess));

          if(password.equals(guess)) {
              System.out.println("Your guess was correct");
          } else {
              System.out.println("This is false");
          }


    }
}
/*
1
 I HAVE STUDIED AT DR. D Y PATIL SCHOOL OF ENGINEERING
 i have studied at dr. d y patil school of engineering

tudied at Dr. D Y Patil School of Engineering
tudied a

let me in
true
false


* */
