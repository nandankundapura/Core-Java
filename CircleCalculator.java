import java.util.Scanner;

public class CircleCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);


        // Prompt the user to enter the radius
        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();

        // Calculate area and circumference
        double area = Math.PI * Math.pow(radius, 2);  // π * r²
        double circumference = 2 * Math.PI * radius;  // 2 * π * r

        // Display the results
        System.out.println("The area of the circle is: " + area);
        System.out.println("The circumference of the circle is: " + circumference);

        // Close the scanner
        sc.close();
    }
}