package ru.mirea.task5.furniture;

public class FurnitureTester
{
    public static void main(String[] args)
    {
        Chair ch = new Chair();
        Sofa so = new Sofa();
        FurnitureShop cs = new FurnitureShop(ch,so);
        FurnitureShop c = new FurnitureShop(ch);
        FurnitureShop s = new FurnitureShop(so);
        ch.setCost("70");
        so.setCost("120");
        System.out.println(c.CheckPrice());
        System.out.println(s.CheckPrice());
        System.out.println(cs.CheckPrice());
        System.out.println(c.toBuy());
        System.out.println(s.toBuy());
        System.out.println(cs.toBuy());
    }
}
