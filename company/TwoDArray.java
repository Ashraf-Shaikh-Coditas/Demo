package com.company;

import java.util.Arrays;

public class TwoDArray {
    public static void main(String[] args) {
        int[][] grades ={{1,5,3},{8,4,2},{4,6,2}};
        System.out.println(Arrays.deepToString(grades));
//        [[1, 5, 3], [8, 4, 2], [4, 6, 2]]

        System.out.println(grades.length);
        System.out.println(grades[0].length);
//       3
//       3

        for(int i=0;i< grades.length;i++) {
            for(int j=0;j< grades[i].length;j++) {
                System.out.print(grades[i][j]+" ");
            }
            System.out.println();
        }
//      1 5 3
//      8 4 2
//      4 6 2


    }
}
