package ru.mirea.task12.Ex1;

import java.util.Scanner;

public class TestClass {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Student[] s = new Student[2];
        int[] iDNumber = new int[7];
        for (int i = 0; i<7; i++)
            iDNumber[i] = sc.nextInt();
        for (int i = 0; i<2; i++) {
            s[i] = new Student();
            System.out.print(s[i].stud);
            System.out.println(i);
        }
        Sort(iDNumber);
        for (int i=0; i<7; i++)
            System.out.println(iDNumber[i]);
    }

    public static void Sort(int[] a) {
        for (int left = 0; left < 7; left++)
        {
            int value = a[left];
            int i = left - 1;
            for (; i >= 0; i--)
            {
                if (value < a[i])
                    a[i + 1] = a[i];
                else
                    break;
            }
            a[i + 1] = value;
        }
    }
}
