package ru.mirea.task1;

import java.util.Random;

public class Mass
{
    public static void main(String[] args)
    {
        int[] m = new int [7];
        int k;
        System.out.println("Massiv");
        for (int i=0; i<7; i++ )
        {
            m[i] = (int) (Math.random() * 100);
            System.out.println(m[i]);
        }

        for(int i=0; i<7; i++)
            for(int j=i+1; j<7; j++)
                if (m[i]>m[j])
                {
                    k=m[i];
                    m[i] = m[j];
                    m[j]=k;
                }

        System.out.println();
        System.out.println("new massiv");
        for (int i=0; i<7; i++ )
        {
            System.out.println(m[i]);
        }

    }
}
