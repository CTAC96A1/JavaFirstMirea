package ru.mirea.task28;

public class Car {
    String model;
    int price;
    int year;
    Type type;

    public Car(Type type, String model, int year, int price) {
        this.type = type;
        this.price = price;
        this.year = year;
        this.model = model;
    }

    public void data() { System.out.println("Автомобиль: " + model + " " + type.type + " " + type.speed + " км/ч " + year + " " + price); }

    private static class Type {
        String type;
        int speed;

        public Type(String type, int speed) {
            this.speed = speed;
            this.type = type;
        }
    }

    public static void main(String[] args) {
        Car Vaz2106 = new Car(new Type("Sedan", 300), "Vaz", 1976, 35000);
        Vaz2106.data();

        Car tesla = new Car(new Type("electrcar", 250), "Model 3", 2022, 500000000) {
            public void data() { System.out.println("Автомобиль -> " + model + " " + type.type + " " + type.speed + " км/ч " + year + " " + price); }
        };

        System.out.println();
        tesla.data();
    }
}