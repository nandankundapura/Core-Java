public class MeaningfulVariables {
    public static void main(String[] args) {
        // Numeric Types
        int age = 25;                      // Age should be an integer
        long population = 8000000000L;      // Large number, suitable for long
        float temperature = 36.5f;          // Temperature can have decimals, suitable for float
        double pi = 3.141592653589793;      // High precision decimal value

        // Character and String Types
        char grade = 'A';                   // Single character
        String name = "John Doe";           // Name should be a string

        // Boolean Type
        boolean isAdult = true;             // Boolean for conditions

        // Byte and Short Types (Used in Specific Cases)
        byte smallNumber = 127;             // Byte range is -128 to 127
        short year = 2025;                  // Short is useful for small integer values

        // Printing values to check correctness
        System.out.println("Age: " + age);
        System.out.println("Population: " + population);
        System.out.println("Temperature: " + temperature);
        System.out.println("Pi: " + pi);
        System.out.println("Grade: " + grade);
        System.out.println("Name: " + name);
        System.out.println("Is Adult: " + isAdult);
        System.out.println("Small Number: " + smallNumber);
        System.out.println("Year: " + year);
    }
}

