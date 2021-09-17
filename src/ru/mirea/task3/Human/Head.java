package ru.mirea.task3.Human;

public class Head
{
    private static final double PI = 3.1416 ;
    int r;

    public Head (int r)
    {
        this.r = r;
    }

    public void DoThink()
    {
        System.out.println("I think...");
    }

    public void setR(int r)
    {
        this.r = r;
    }

    public int getR()
    {
        return r;
    }

    public double getArea()
    {
        return PI*r*r;
    }

    @Override
    public String toString() {
        return "Area= " + getArea()+ " ";
    }
}
