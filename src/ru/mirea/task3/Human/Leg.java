package ru.mirea.task3.Human;

public class Leg
{
    double length;

    public Leg (double length)
    {
        this.length = length;
    }

    public void getSick()
    {
        System.out.println("leg is sick");
    }

    public void setLength(int length)
    {
        this.length = length;
    }

    public double getLength()
    {
        return length;
    }

    @Override
    public String toString() {
        return "length leg=" + length+ " ";
    }
}
