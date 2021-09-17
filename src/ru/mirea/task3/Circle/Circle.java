package ru.mirea.task3.Circle;

public class Circle
{
    final double PI=3.1416;
    int r;
    Circle (int r)
    {
        this.r = r;
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

    public double getPerimeter()
    {
        return PI*r*2;
    }

    @Override
    public String toString()
    {
        return "r=" + r +" Area= "+ getArea() + " Perimeter= "+ getPerimeter();
    }
}
