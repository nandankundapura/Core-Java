public class StudentGrades {
    public static void main(String[] args) {
      int mark1 = 95;
       int mark2 = 82;
       int mark3 = 74;
        int mark4 = 50;

    printGrade("Student 1", mark1);
      printGrade("Student 2", mark2);
        printGrade("Student 3", mark3);
        printGrade("Student 4", mark4);
   }

    public static void printGrade(String studentName, int marks) {
        System.out.print(studentName + " scored " + marks + " Grade: ");

    if (marks >= 90) {
           System.out.println("A+");
     } else if (marks >= 80) {
          System.out.println("A");
        } else if (marks >= 70) {
            System.out.println("B");
    } else if (marks >= 60) {
            System.out.println("C");
        } else {
            System.out.println("F");
        }
    }
}
