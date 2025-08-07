public class PassCount {
    public static void main(String[] args) {
      int mark1 = 45;
        int mark2 = 38;
        int mark3 = 90;

   int passCount = 0;
     int i = 1;
        while (i <= 3) {
     int currentMark = 0;
       if (i == 1) {
            currentMark = mark1;
      } else if (i == 2) {
         currentMark = mark2;
       } else if (i == 3) {
            currentMark = mark3;
         }
  if (currentMark >= 40) {
          passCount++;
         }
           i++;
        }
   System.out.println("Total students passed: " + passCount);
     System.out.println("Total students appeared: 3");
    }
}
