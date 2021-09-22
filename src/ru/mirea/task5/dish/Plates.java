package ru.mirea.task5.dish;

public class Plates extends Dish
{
    private String con;
    private String integ;
    public Plates (String con)
    {
        this.con = con;
    }

    public String Condition()
    {
        if (integ != "split")
        {
            if (con == "dirty")
                return "The plates is dirty";
            else
                return "The plates is clean";
        }
        else
        {
            con = integ;
            return "The plates is broken";
        }
    }

    public void toClean()
    {
        if (integ != "broken")
            con = "clean";
    }

    public void toClean(String con)
    {
        con = "clean";
    }

    public void breakDown(String integ)
    {
        this.integ = integ;
    }

    @Override
    public String toString() {
        return Condition();
    }
}
