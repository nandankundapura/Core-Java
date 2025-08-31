package com.Xworkz.inheritance;

public class Person {
    Person() {
        System.out.println("Person constructor called");
    }
}

class Student extends Person {
    Student() {
        super();
        System.out.println("Student constructor called");
    }
}

public class SingleLevelExample {
    public static void main(String[] args) {
        Student s = new Student();
    }
}
