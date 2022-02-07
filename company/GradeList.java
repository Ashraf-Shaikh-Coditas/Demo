package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GradeList {
    public static void main(String[] args) {
        List<Integer> grades = new ArrayList<Integer>();
        grades.add(5);
        grades.add(10);
        grades.add(1,7);

        System.out.println(grades.get(0));
        System.out.println(grades.get(1));
        System.out.println(grades.get(2));
//      5
//      7
//      10

        System.out.println(grades.contains(7));
//      true

        grades.clear();

        grades = Arrays.asList(5,3,2,4,1);
        System.out.println(Arrays.toString(grades.toArray()));
//      [5, 3, 2, 4, 1]


        for(int i=0;i<grades.size();i++) {
            System.out.println(grades.get(i));
        }
//      5
//      3
//      2
//      4
//      1

        for(int i : grades) {
            System.out.print(i+" ");
        }
//     5 3 2 4 1

        List<List<Integer>> allGrades = new ArrayList<List<Integer>>();
        allGrades.add(Arrays.asList(5,3,2,4,1));
        allGrades.add(Arrays.asList(9,8,2,7,1));
        allGrades.add(Arrays.asList(10,7,4,6,3));

        for(List<Integer> list : allGrades) {
            for(int grade : list) {
                System.out.print(grade+" ");
            }
            System.out.println();
        }

//        5 3 2 4 1
//        9 8 2 7 1
//        10 7 4 6 3

        List<Integer> list = Arrays.asList(4,6,2,8,10,34);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
//      [4, 6, 2, 8, 10, 34]
//      [2, 4, 6, 8, 10, 34]
//      [34, 10, 8, 6, 4, 2]



    }


}
