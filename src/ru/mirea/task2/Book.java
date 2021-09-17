package ru.mirea.task2;

public class Book
{
    String name;
    int nameOfPages;
    public Book(String name, int nameOfPages)
    {
        this.name = name;
        this.nameOfPages = nameOfPages;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNameOfPages(int nameOfPages) {
        this.nameOfPages = nameOfPages;
    }

    public String getName() {
        return name;
    }

    public int getNameOfPages() {
        return nameOfPages;
    }

    @Override
    public String toString() {
        return "book name=" + name +
                ", nameOfPages=" + nameOfPages;
    }
}
