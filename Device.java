package com.Xworkz.inheritance;

public class Device {
    Device() {
        System.out.println("Device constructor called");
    }
}

class Computer extends Device {
    Computer() {
        super();
        System.out.println("Computer constructor called");
    }
}

class Laptop extends Computer {
    Laptop() {
        super();
        System.out.println("Laptop constructor called");
    }
}
public class MultiLevelExample {
    public static void main(String[] args) {
        Laptop l = new Laptop();
    }
}
