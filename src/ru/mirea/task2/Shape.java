package ru.mirea.task2;

public class Shape
{
    String name;
    public Shape(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    public String toString() {
        return "name of figure= " + name;
    }
}
