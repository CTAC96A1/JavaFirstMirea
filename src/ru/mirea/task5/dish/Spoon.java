package ru.mirea.task5.dish;

public class Spoon extends Dish
{
    private String con;
    private String integ;
    public Spoon(String con)
    {
        this.con = con;
    }
    protected String Condition()
    {
        if (integ != "break")
        {
            if (con == "dirty")
                return "The spoon is dirty";
            else
                return "The spoon is clean";
        }
        else
        {
            con = integ;
            return "The spoon is broken";
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
