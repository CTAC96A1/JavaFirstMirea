package ru.mirea.task1;

import java.util.Scanner;

public class Fact {
    public static void main(String[] args)
    {
        int i;
        Scanner sc = new Scanner(System.in);
        i = sc.nextInt();
        i = DoFactorial(i);
        System.out.println(i);
    }

    public static int DoFactorial(int i)
    {
        int a=1;
        for(int j=1; j<i+1; j++)
            a=a*j;
        return a;
    }
}
