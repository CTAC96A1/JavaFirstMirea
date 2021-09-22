package ru.mirea.task5.furniture;

public class Sofa
{
    public String cost;
    public String Parts()
    {
        return "4x little leg, footing, some pillow";
    }

    public String Material()
    {
        return "wood and metal";
    }

    public void setCost(String cost)
    {
        this.cost = cost;
    }

    public String getCost()
    {
        return cost;
    }

    @Override
    public String toString() {
        return "Sofa have: " + Parts() + " and made of " + Material();
    }
}
