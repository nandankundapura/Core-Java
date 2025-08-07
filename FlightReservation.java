public class FlightReservation {
    private String passengerName;
    private String flightNumber;
    private String source;
    private String destination;
    private double fare;

    public FlightReservation(String passengerName) {
        this.passengerName = passengerName;
        System.out.println("Initializing passengerName");
    }

    public FlightReservation(String passengerName, String flightNumber) {
        this(passengerName);
        this.flightNumber = flightNumber;
        System.out.println("Initializing flightNumber");
    }

    public FlightReservation(String passengerName, String flightNumber, String source) {
        this(passengerName, flightNumber);
        this.source = source;
        System.out.println("Initializing source");
    }

    public FlightReservation(String passengerName, String flightNumber, String source, String destination) {
        this(passengerName, flightNumber, source);
        this.destination = destination;
        System.out.println("Initializing destination");
    }

    public FlightReservation(String passengerName, String flightNumber, String source, String destination, double fare) {
        this(passengerName, flightNumber, source, destination);
        this.fare = fare;
        System.out.println("Initializing fare");
    }

    public String getPassengerName() { return passengerName; }
    public String getFlightNumber() { return flightNumber; }
    public String getSource() { return source; }
    public String getDestination() { return destination; }
    public double getFare() { return fare; }
}
