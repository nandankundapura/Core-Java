import java.util.*;
public class OddEven {
     public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
         int n=sc.nextInt();
         if(n==0) {
          System.exit(0);
     }
     else if(n%2==0) {
          System.out.println("Number is Even");
     }
     else if(n%2!=0) {
          System.out.println("Number is Odd");
     }

}
}