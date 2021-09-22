package ru.mirea.task5.dog;

public class MiniatureSchnauzer extends Dog
{
    public String toBark()
    {
        return "MiniatureSchnauzer is bark on people";
    }

    public String toPlay()
    {
        return "MiniatureSchnauzer play with owner";
    }

    public int getHeight()
    {
        return 33;
    }

    public String toString() {
        return "MiniatureSchnauzer height is " + getHeight() + "cm";
    }
}
