package ru.mirea.task1;

public class Gor
{
    public static void main(String[] args)
    {
        double[] a = new double[10];
        for (int i=0; i<10; i++ )
        {
            a[i] = 1 / (1 + (double)i);
            System.out.println(a[i]);
        }

    }
}
