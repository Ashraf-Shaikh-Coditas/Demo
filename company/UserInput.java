package com.company;

import java.math.BigDecimal;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String x = scanner.nextLine();
        System.out.println(x);
        int y = scanner.nextInt();
        System.out.println(y);
        System.out.println(y+10);
//      Ashraf
//      Ashraf
//      10
//      10
//      20

        BigDecimal money = scanner.nextBigDecimal();
        boolean bool = scanner.nextBoolean();
        System.out.println(bool);
//      true

        int a = (int)scanner.nextDouble();
        System.out.println(a);
//        30.999
//        30

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.NaN);
        System.out.println(Double.POSITIVE_INFINITY);
        System.out.println(Double.NEGATIVE_INFINITY);
//        -2147483648
//        1.7976931348623157E308
//        NaN
//         Infinity
//        -Infinity

        int num = 5;
        double b =(double) num/2;
        System.out.println(b);
//      2.5

        System.out.println(5%2);
//        1
    }
}
