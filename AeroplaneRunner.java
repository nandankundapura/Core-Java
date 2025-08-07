public class AeroplaneRunner {
    public static void main(String[] args) {
        Aeroplane a1 = new Aeroplane("A320", "IndiGo", 180, 840.5, "Delhi");
        Aeroplane a2 = new Aeroplane("Boeing 777", "Air India", 300, 905.2, "Mumbai");
        Aeroplane a3 = new Aeroplane("Embraer E190", "Vistara", 100, 820.0, "Goa");
        Aeroplane a4 = new Aeroplane("737 MAX", "SpiceJet", 200, 890.0, "Kolkata");
        Aeroplane a5 = new Aeroplane("CRJ900", "Jet Airways", 90, 780.0, "Chennai");

        System.out.println(a1.getModel());
        System.out.println(a2.getAirline());
        System.out.println(a3.getCapacity());
        System.out.println(a4.getSpeed());
        System.out.println(a5.getOrigin());
    }
}
