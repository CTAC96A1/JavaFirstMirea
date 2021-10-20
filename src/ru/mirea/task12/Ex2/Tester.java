package ru.mirea.task12.Ex2;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Student[] s = new Student[4];
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<4; i++) {
            s[i] = new Student();
            s[i].s = sc.nextLine();
        }
        for (int i=0; i<4; i++)
            s[i].mark = sc.nextInt();
        SortingStudentsByGPA sort = new SortingStudentsByGPA();
        sort.Sort(s, 0, 3);
        for (int i=0; i<4; i++) {
            System.out.println(s[i].getS());
            System.out.println(s[i].getMark());
        }
    }


}
