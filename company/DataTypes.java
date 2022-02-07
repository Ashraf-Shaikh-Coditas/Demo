package com.company;

public class DataTypes {

    public static final double PI = 3.14;

    public static void main(String[] args) {
        int x;
        x = 5;
        x = 10;

        boolean isPizzaDelicious = true;
        byte by = 127;
        char c = 'C';
        short s = 32767;
        int i = 4343425;
        long l = 35632635343432L;

        float f = 20.5f;
        double d = 20.5d;

        int a = 10;
        int b = 20;
        System.out.println(Integer.max(a,b));
        System.out.println(Integer.compare(a,b));
//      20
//      -1

        String money = "300";
        Integer m = Integer.valueOf(money);
        int n = Integer.parseInt(money);
        System.out.println(m);
        System.out.println(n);
//      300
//      300

        String s1 ="hello";
        System.out.println(s1.charAt(0));
//        h


        s1 ="hello\n\n\ncats";
        System.out.println(s1+" and dogs.");
//      hello
//
//
//
//      cats and dogs.


        String name = "Ashraf";
        System.out.println(String.format("Hello %s",name));
//      Hello Ashraf

        System.out.println(name.length());
//        6






    }
}
