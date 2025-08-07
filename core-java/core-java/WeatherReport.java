public class WeatherReport {
    private String city;
    private double temperature;
    private int humidity;
    private String condition;
    private String date;

    public WeatherReport(String city) {
        this.city = city;
        System.out.println("Initializing city");
    }

    public WeatherReport(String city, double temperature) {
        this(city);
        this.temperature = temperature;
        System.out.println("Initializing temperature");
    }

    public WeatherReport(String city, double temperature, int humidity) {
        this(city, temperature);
        this.humidity = humidity;
        System.out.println("Initializing humidity");
    }

    public WeatherReport(String city, double temperature, int humidity, String condition) {
        this(city, temperature, humidity);
        this.condition = condition;
        System.out.println("Initializing condition");
    }

    public WeatherReport(String city, double temperature, int humidity, String condition, String date) {
        this(city, temperature, humidity, condition);
        this.date = date;
        System.out.println("Initializing date");
    }

    public String getCity() { return city; }
    public double getTemperature() { return temperature; }
    public int getHumidity() { return humidity; }
    public String getCondition() { return condition; }
    public String getDate() { return date; }
}
