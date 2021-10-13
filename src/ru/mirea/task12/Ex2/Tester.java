package ru.mirea.task12.Ex2;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        int loci;
        String locs;
        SortingStudentsByGPA[] s = new SortingStudentsByGPA[4];
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<4; i++)
        {
            s[i] = new SortingStudentsByGPA();
            locs = sc.nextLine();
            s[i].setS(locs);
        }
        for (int i=0; i<4; i++)
        {
            loci = sc.nextInt();
            s[i].setMark(loci);
        }
        Sort(s, 0, 3);
        for (int i=0; i<4; i++) {
            System.out.println(s[i].getS());
            System.out.println(s[i].getMark());
        }
    }

    public static void Sort(SortingStudentsByGPA[] s, int left, int right)
    {
        int leftMarker = left;
        int rightMarker = right;
        int pivot = s[(leftMarker + rightMarker) / 2].getMark();
        do {
            // Двигаем левый маркер слева направо пока элемент меньше, чем pivot
            while (s[leftMarker].getMark() < pivot) {
                leftMarker++;
            }
            // Двигаем правый маркер, пока элемент больше, чем pivot
            while (s[rightMarker].getMark() > pivot) {
                rightMarker--;
            }
            // Проверим, не нужно обменять местами элементы, на которые указывают маркеры
            if (leftMarker <= rightMarker) {
                // Левый маркер будет меньше правого только если мы должны выполнить swap
                if (leftMarker < rightMarker) {
                    SortingStudentsByGPA tmp = s[leftMarker];
                    s[leftMarker] = s[rightMarker];
                    s[rightMarker] = tmp;
                }
                // Сдвигаем маркеры, чтобы получить новые границы
                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);

        // Выполняем рекурсивно для частей
        if (leftMarker < right) {
            Sort(s, leftMarker, right);
        }
        if (left < rightMarker) {
            Sort(s, left, rightMarker);
        }
    }
}
