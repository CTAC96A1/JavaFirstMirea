package ru.mirea.task13;

public class TesterMyArr {
    public static void main(String[] args) {
        MyArr<String> marks = new MyArr();

        marks.add("Germany");
        marks.add("Russia");
        marks.add("USA");

        System.out.println("Вывод элементов:");
        System.out.println(marks + " ");

        System.out.println("Длинна списка: ");
        System.out.println(marks.size());

        System.out.println("Вывод 3 элемента списка: ");
        System.out.println(marks.get(2));

        marks.set(2, "UK");
        System.out.println("Замена 3 элемента:");
        System.out.println(marks + " ");

        System.out.println("Вывод индекса элемента <UK>:");
        System.out.println(marks.indexOf("UK"));

        marks.remove(2);
        System.out.println("Удаление элемента 3:");
        System.out.println(marks + " ");
    }

}
