package ru.mirea.task1;

import java.util.Scanner;
import java.lang.*;
public class Sum
{
    public static void main(String[] args)
    {
        int i;
        int sum=0;
        int[] m = new int [5];
        for ( i = 0; i <5; i++)
            m[i] = i;

        for ( i = 0; i <5; i++)
            sum +=m[i];
        System.out.println(sum);
        System.out.println();

        sum = 0;
        i=0;
        while (i<5)
        {
            sum+=m[i];
            i++;
        }
        System.out.println(sum);
        System.out.println();

        sum=0;
        i=0;
        do
            {
            sum +=m[i];
            i++;
            }
        while (i<5);
        System.out.println(sum);

    }
}
