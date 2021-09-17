package ru.mirea.task3.Human;

public class Human
{
    Head h;
    Leg g;
    Hand ha;
    public Human (int r, double lengthLeg, double lengthHand)
    {
        h = new Head(r);
        g = new Leg(lengthLeg);
        ha = new Hand(lengthHand);
    }

    @Override
    public String toString()
    {
        return h.toString() + g.toString()+ ha.toString();
    }
}
