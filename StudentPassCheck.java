public class StudentPassCheck {
    public static void main(String[] args) {
   int marks = 30;

   do {
            System.out.println("Marks: " + marks);

            if (marks >= 40) {
                System.out.println("Passed");
      } else {
                System.out.println("Failed");
      }

    marks += 10;

    } while (marks < 40);
    }
}
