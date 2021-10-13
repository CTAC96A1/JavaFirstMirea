package ru.mirea.task12.Ex2;

public class SortingStudentsByGPA implements Comparator
{
    private String s="";
    private int mark = 0;

    @Override
    public void setS(String s) {
        this.s = s;
    }

    @Override
    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public String getS() {
        return s;
    }

    @Override
    public int getMark() {
        return mark;
    }
}
