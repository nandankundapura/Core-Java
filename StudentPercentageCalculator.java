import java.util.Scanner;

public class StudentPercentageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalSubjects = 5;
        int[] marks = new int[totalSubjects];
        int totalMarks = 0;
        
        System.out.println("Enter marks for " + totalSubjects + " subjects:");
        for (int i = 0; i < totalSubjects; i++) {
            System.out.print("Subject " + (i + 1) + " marks: ");
            marks[i] = scanner.nextInt();
            totalMarks += marks[i];
        }
        
        scanner.close();
        
        double percentage = (double) totalMarks / (totalSubjects * 100) * 100;
        
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");
    }
}
