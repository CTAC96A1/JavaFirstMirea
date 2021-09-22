package ru.mirea.task5.furniture;
import java.lang.*;
public class FurnitureShop
{
    Chair chair;
    Sofa sofa;

    public FurnitureShop(Chair chair, Sofa sofa)
    {
        this.chair = chair;
        this.sofa = sofa;
    }

    public FurnitureShop(Chair chair)
    {
        this.chair = chair;
    }

    public FurnitureShop( Sofa sofa)
    {
        this.sofa = sofa;
    }

    public String CheckPrice()
    {
        if (chair!= null && sofa!= null)
            return ("chair: "+chair.getCost()+"$ and " + "sofa: "+sofa.getCost()+"$");
        else if (chair!= null)
            return "chair: " + chair.getCost()+"$";
             else
                 return  "sofa: "+sofa.getCost()+"$";
    }

    public String toBuy()
    {
        return "You buy " + CheckPrice();
    }
}
