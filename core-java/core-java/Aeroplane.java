public class Aeroplane {
    private String model;
    private String airline;
    private int capacity;
    private double speed;
    private String origin;

    public Aeroplane(String model) {
        this.model = model;
        System.out.println("Initializing model");
    }

    public Aeroplane(String model, String airline) {
        this(model);
        this.airline = airline;
        System.out.println("Initializing airline");
    }

    public Aeroplane(String model, String airline, int capacity) {
        this(model, airline);
        this.capacity = capacity;
        System.out.println("Initializing capacity");
    }

    public Aeroplane(String model, String airline, int capacity, double speed) {
        this(model, airline, capacity);
        this.speed = speed;
        System.out.println("Initializing speed");
    }

    public Aeroplane(String model, String airline, int capacity, double speed, String origin) {
        this(model, airline, capacity, speed);
        this.origin = origin;
        System.out.println("Initializing origin");
    }

    public String getModel() { return model; }
    public String getAirline() { return airline; }
    public int getCapacity() { return capacity; }
    public double getSpeed() { return speed; }
    public String getOrigin() { return origin; }
}
