public class WeatherReportRunner {
    public static void main(String[] args) {
        WeatherReport w1 = new WeatherReport("Delhi", 34.5, 70, "Sunny", "2025-08-01");
        WeatherReport w2 = new WeatherReport("Mumbai", 28.0, 80, "Rainy", "2025-08-02");
        WeatherReport w3 = new WeatherReport("Bangalore", 24.5, 60, "Cloudy", "2025-08-03");
        WeatherReport w4 = new WeatherReport("Chennai", 30.2, 75, "Humid", "2025-08-04");
        WeatherReport w5 = new WeatherReport("Hyderabad", 29.0, 65, "Partly Cloudy", "2025-08-05");

        System.out.println(w1.getCity());
        System.out.println(w2.getTemperature());
        System.out.println(w3.getHumidity());
        System.out.println(w4.getCondition());
        System.out.println(w5.getDate());
    }
}
