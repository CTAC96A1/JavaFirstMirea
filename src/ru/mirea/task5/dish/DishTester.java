package ru.mirea.task5.dish;

public class DishTester
{
    public static void main(String[] args)
    {
        Spoon sp = new Spoon("dirty");
        Plates pl = new Plates("dirty");
        System.out.println(sp);
        sp.toClean();
        System.out.println(sp);
        sp.breakDown("break");
        System.out.println(sp);
        System.out.println(pl);
        pl.toClean();
        System.out.println(pl);
        pl.breakDown("split");
        System.out.println(pl);
    }
}
