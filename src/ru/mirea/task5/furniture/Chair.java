package ru.mirea.task5.furniture;

public class Chair extends Furniture
{
    String cost;
    public String Parts()
    {
        return "4x leg, seater, back";
    }

    public String Material()
    {
        return "wood";
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
        return "Chair have: " + Parts() + " and made of " + Material();
    }
}
