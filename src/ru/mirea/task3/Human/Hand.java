package ru.mirea.task3.Human;

public class Hand
{
    double length;

    public Hand (double length)
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

    public void ReachOut()
    {
        System.out.println("I'm reaching out");
    }

    @Override
    public String toString() {
        return "length hand=" + length;
    }
}
