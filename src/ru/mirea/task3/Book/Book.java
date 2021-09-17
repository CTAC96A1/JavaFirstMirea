package ru.mirea.task3.Book;

public class Book
{
    String author;
    String nameOfBook;
    int year;
    int numberOfPages;

    public Book (String author, String nameOfBook, int year, int numberOfPages)
    {
        this.author = author;
        this.nameOfBook = nameOfBook;
        this.numberOfPages = numberOfPages;
        this.year = year;
    }

    public int getNumberOfPages()
    {
        return numberOfPages;
    }

    public String getAuthor()
    {
        return author;
    }

    public int getYear()
    {
        return year;
    }

    public String getNameOfBook()
    {
        return nameOfBook;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    public void setNameOfBook(String nameOfBook)
    {
        this.nameOfBook = nameOfBook;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

    public void setNumberOfPages(int numberOfPages)
    {
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String toString() {
        return "author= " + author + ' ' +
                ", nameOfBook= " + nameOfBook + ' ' +
                ", year=" + year +
                ", numberOfPages=" + numberOfPages;
    }
}
