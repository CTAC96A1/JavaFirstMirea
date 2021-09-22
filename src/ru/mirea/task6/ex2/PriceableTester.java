package ru.mirea.task6.ex2;

public class PriceableTester
{
    public static void main(String[] args) {
        House house = new House();
        Car car = new Car();
        System.out.println(house.getPrice());
        System.out.println(car.getPrice());
    }
}
