package com.Xworkz.inheritance;

public class Employee {
    Employee() {
        System.out.println("Employee constructor called");
    }
}
class Manager extends Employee {
    Manager() {
        super();
        System.out.println("Manager constructor called");
    }
}
class Developer extends Employee {
    Developer() {
        super();
        System.out.println("Developer constructor called");
    }
}
public class HierarchicalExample {
    public static void main(String[] args) {
        Manager m = new Manager();
        System.out.println();
        Developer d = new Developer();
    }
}
