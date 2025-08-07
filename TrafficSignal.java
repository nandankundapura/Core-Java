public class TrafficSignal {
    public static void main(String[] args) {
        String signal = "green";

        switch (signal.toLowerCase()) {
            case "red": System.out.println("Stop"); 
		break;
            case "yellow": System.out.println("Wait");
		 break;
            case "green": System.out.println("Go");
		 break;
            case "blue": System.out.println("Invalid for traffic");
		 break;
            case "white": System.out.println("Police Control");
		 break;
            default: System.out.println("Unknown signal");
      }
    }
}
