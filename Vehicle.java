package com.Xworkz.inheritance;

public class Vehicle {
    public void run() {
        System.out.println("Vehicle is running");
    }
}

class Car extends Vehicle {
    @Override
    public void run() {
        System.out.println("Car is running");
    }

    public void fuel() {
        System.out.println("Car uses fuel");
    }

    public void fuel(int amount) {
        System.out.println("Car refueled with " + amount + " liters");
    }

    // final method
    public final void show() {
        System.out.println("This is a final method");
    }

    public final void show(int speed) {
        System.out.println("Car speed is " + speed);
    }

    public static void display() {
        System.out.println("This is a static method");
    }

    public static void display(String msg) {
        System.out.println("Static method overloaded with: " + msg);
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Car c = new Car();

        c.run();
        c.fuel();
        c.fuel(50);
        c.show();
        c.show(120);
        Car.display();
        Car.display("Sedan");
    }
}
