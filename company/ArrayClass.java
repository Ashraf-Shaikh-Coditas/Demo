package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayClass {
    public static void main(String[] args) {
        int[] grades = {9,9,7,4,2,5,10};
        grades[1]=912;
        System.out.println(Arrays.toString(grades));
//    [9, 912, 7, 4, 2, 5, 10]


        int[][] arr1 ={{1,2,3},{4,5,6}};
        System.out.println(Arrays.deepToString(arr1));
//    [[1, 2, 3], [4, 5, 6]]

        grades = new int[10];
        for(int i=0;i<10;i++) {
            grades[i]=5;
        }
        System.out.println(Arrays.toString(grades));
//       [5, 5, 5, 5, 5, 5, 5, 5, 5, 5]


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = scanner.nextInt();
        for(int i=0;i<10;i++) {
            int x = scanner.nextInt();
            grades[i]=x;
        }
        System.out.println(Arrays.toString(grades));
//
//      [90, 98, 98, 65, 84, 89, 97, 75, 69, 91]

        int[] arr2 = {90, 98, 98, 65, 84, 89, 97, 75, 69, 91};
        for(int i=0;i<arr2.length;i++) {
            System.out.println(arr2[i]);
        }
//    90
//    98
//    98
//    65
//    84
//    89
//    97
//    75
//    69
//    91

        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
//      [65, 69, 75, 84, 89, 90, 91, 97, 98, 98]
        int[] arr3 ={65, 69, 75, 84, 89, 90, 91, 97, 98, 98};

        if(Arrays.equals(arr2,arr3)) {
            System.out.println("EQUAL");
        }
//      EQUAL


        int arr4[]= new int[10];
        Arrays.fill(arr4,1);
        System.out.println(Arrays.toString(arr4));
//      [1, 1, 1, 1, 1, 1, 1, 1, 1, 1]




    }
}

/*













* */
