package ru.mirea.task29;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        String[] quotes = {"У России лишь два союзника - армия и флот", "Папа Римский? И сколько у него дивизий?", "Тора, Тора, Тора", "Польское наступление не остановить!"};
        String[] minor = {"Бутан", "Тану-Тува", "Люксембург"};
        String[] diplomacy = {"Казахстан угрожает нам бомбардировкой! Казахстан угрожает нам бомбардировкой!"};

        CurrencyInfo currencyInfo = new CurrencyInfo(quotes, minor, diplomacy);

        FileOutputStream outputStream = new FileOutputStream("C:\\Users\\home\\Documents");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(currencyInfo);
        objectOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\home\\Documents");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        CurrencyInfo currencyInfo1 = (CurrencyInfo) objectInputStream.readObject();
        System.out.println(currencyInfo1);
    }
}