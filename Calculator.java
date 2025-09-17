import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter first number: ");
            double a = sc.nextDouble();
            System.out.print("Enter second number: ");
            double b = sc.nextDouble();
            System.out.print("Choose operation (1:+ 2:- 3:* 4:/ 5:%): ");
            switch (sc.nextInt()) {
                case 1 -> System.out.println("Result: " + (a + b));
                case 2 -> System.out.println("Result: " + (a - b));
                case 3 -> System.out.println("Result: " + (a * b));
                case 4 -> System.out.println(b != 0 ? "Result: " + (a / b) : "Error: Division by zero");
                case 5 -> System.out.println(b != 0 ? "Result: " + (a % b) : "Error: Modulo by zero");
                default -> System.out.println("Invalid choice");
            }
        } catch (Exception e) {
            System.out.println("Invalid input! Use numbers only.");
        } finally {
            sc.close();
        }
    }
}
