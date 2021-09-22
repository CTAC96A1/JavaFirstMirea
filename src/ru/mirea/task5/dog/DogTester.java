package ru.mirea.task5.dog;

public class DogTester
{
    public static void main(String[] args)
    {
        Husky h = new Husky();
        Shepherd s = new Shepherd();
        MiniatureSchnauzer ms = new MiniatureSchnauzer();
        System.out.println(h.toPlay());
        System.out.println(h.toBark());
        System.out.println(s.toBark());
        System.out.println(s.toPlay());
        System.out.println(ms.toBark());
        System.out.println(ms.toPlay());
        System.out.println(h);
        System.out.println(s);
        System.out.println(ms);
    }
}
