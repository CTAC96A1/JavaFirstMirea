package ru.mirea.task3.Human;

public class TestHuman
{
    public static void main(String[] args)
    {
        Human h = new Human(15, 0.75,0.63);
        System.out.println(h);
        h.h.DoThink();
        h.g.getSick();
        h.ha.ReachOut();
    }
}
