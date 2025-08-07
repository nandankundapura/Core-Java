public class FlightReservationRunner {
    public static void main(String[] args) {
        FlightReservation f1 = new FlightReservation("John Doe", "AI101", "Mumbai", "Delhi", 7500);
        System.out.println(f1.getPassengerName());
        System.out.println(f1.getFlightNumber());
        System.out.println(f1.getSource());
        System.out.println(f1.getDestination());
        System.out.println(f1.getFare());

        FlightReservation f2 = new FlightReservation("Alice", "6E202", "Bangalore", "Hyderabad", 3200);
        FlightReservation f3 = new FlightReservation("Bob", "UK303", "Delhi", "Chennai", 5600);
        FlightReservation f4 = new FlightReservation("Carol", "SG404", "Kolkata", "Pune", 4800);
        FlightReservation f5 = new FlightReservation("David", "AI505", "Mumbai", "Goa", 3500);
    }
}
