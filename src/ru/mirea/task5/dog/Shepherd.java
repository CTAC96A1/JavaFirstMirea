package ru.mirea.task5.dog;

public class Shepherd extends Dog
{
    public String toBark()
    {
        return "Shepherd dog is bark on owner";
    }

    public String toPlay()
    {
        return "Shepherd dog play with owner";
    }

    public int getHeight()
    {
        return 60;
    }

    @Override
    public String toString() {
        return "Shepherd dog height is " + getHeight() + "cm";
    }
}
