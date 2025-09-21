package StringPrograms;

interface Engine {
    void startEngine();
    default void fuelType() {
        System.out.println("Fuel type: Petrol");
    }
    static void engineInfo() {
        System.out.println("Engine is a mechanical system that powers vehicles");
    }
}

interface Vehicle {
    void move();
    default void vehicleType() {
        System.out.println("Vehicle type: Four-wheeler");
    }
    static void vehicleInfo() {
        System.out.println("Vehicles are used for transportation");
    }
}

class Car implements Engine, Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Car engine started");
    }

    @Override
    public void move() {
        System.out.println("Car is moving");
    }

    @Override
    public void fuelType() {
        System.out.println("Overridden fuel type: Diesel");
    }
}

public class Runner {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.startEngine();
        myCar.move();
        myCar.fuelType();
        myCar.vehicleType();

        Engine.engineInfo();
        Vehicle.vehicleInfo();
    }
}

