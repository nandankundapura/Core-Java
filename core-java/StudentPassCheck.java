public class StudentPassCheck {
   public static void main(String[] args) {
        int marks = 30;
     do {
           System.out.println("Marks: " + marks);

      if (marks >= 75) {
            System.out.println("Distinction");
      } else if (marks >= 40) {
          System.out.println("Passed");
   } else {
            System.out.println("Failed");
         }
    System.out.println(); 
            marks += 10;
    } while (marks <= 60);
    }
}
