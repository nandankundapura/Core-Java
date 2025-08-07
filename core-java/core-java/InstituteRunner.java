public class InstituteRunner {
    public static void main(String[] args) {
        Institute i1 = new Institute("IIT Bombay", "Mumbai", 5000, 40, "Dr. Mehta");
        Institute i2 = new Institute("NIT Trichy", "Trichy", 4000, 35, "Dr. Sinha");
        Institute i3 = new Institute("BITS Pilani", "Pilani", 3000, 30, "Dr. Reddy");
        Institute i4 = new Institute("IISc", "Bangalore", 2000, 25, "Dr. Rao");
        Institute i5 = new Institute("JNU", "Delhi", 2500, 20, "Dr. Sharma");

        System.out.println(i1.getName());
        System.out.println(i2.getLocation());
        System.out.println(i3.getStudents());
        System.out.println(i4.getCourses());
        System.out.println(i5.getPrincipal());
    }
}
