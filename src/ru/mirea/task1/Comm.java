package ru.mirea.task1;

import java.util.Scanner;

public class Comm
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String[] a = new String[5];
        for (int i=0; i<5; i++)
            a[i] = sc.nextLine();
        System.out.println();
        for (int i=0; i<5; i++)
            System.out.println(a[i]);
    }
}
