package ru.mirea.task7.Ex1;
import java.lang.*;
public class Derrived1 extends Shape
{
    public int i=0;

    public void Printer (int i)
    {
        this.i=i;
    }

    @Override
    public String toString()
    {
        return "i=" + i ;
    }
}
