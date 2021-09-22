package ru.mirea.task5.dog;

public class Husky extends Dog
{
    public String toBark()
    {
        return "Husky is not bark";
    }

    public String toPlay()
    {
        return "Husky play with owner";
    }

    public int getHeight()
    {
        return 56;
    }

    public String toString() {
        return "Husky height is " + getHeight() + "cm";
    }
}
