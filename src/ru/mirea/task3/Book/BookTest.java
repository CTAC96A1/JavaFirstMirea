package ru.mirea.task3.Book;

public class BookTest
{
    public static void main(String[] args)
    {
        Book Witcher = new Book ("Sapkovsky", "Witcher", 2013, 1368 );
        System.out.println(Witcher);
        Witcher.setNameOfBook("Last wish");
        Witcher.setNumberOfPages(218);
        Witcher.setYear(1993);
        System.out.println();
        System.out.println(Witcher);
    }
}
