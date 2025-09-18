package StringPrograms;

public class Vehicle {
    abstract void start();
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car is starting");
    }
    void drive() {
        System.out.println("Car is being driven");
    }
}

public class Runner {
    public static void main(String[] args) {
        Vehicle v = new Car();
        v.start();
        Car c = (Car) v;
        c.drive();
    }
}
