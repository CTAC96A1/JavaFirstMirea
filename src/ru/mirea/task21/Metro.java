package ru.mirea.task21;
import java.util.ArrayList;

public class Metro {
    ArrayList<String> lines = new ArrayList<String>();
    Metro() {
        lines.add("Сокольническая");
        lines.add("Замоскворецкая");
        lines.add("Арбатско-Покровская");
        lines.add("Филёвская");
        lines.add("Кольцевая");
        lines.add("Калужско-Рижская");
        lines.add("Таганско-Краснопресненская");
        lines.add("Калининская");
        lines.add("Серпуховско-Тимирязевская");
        lines.add("Люблинско-Дмитровская");
        lines.add("Большая кольцевая");
        lines.add("Бутовская");
        lines.add("Солнцевская");
        lines.add("Московское центральное кольцо");
        lines.add("Некрасовская");
    }
    public void PrintList(boolean state){
        for(int i = 0; i < lines.size(); i++){
            if(state){
                if(i % 2 == 0)
                    System.out.println("Линия: " + lines.get(i));
            }
            else if(i % 2 == 1)
                System.out.println("Линия: " + lines.get(i));
        }
    }
}
