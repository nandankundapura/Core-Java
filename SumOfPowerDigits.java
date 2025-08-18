public class SumOfPowerDigits {
    public static void main(String[] args) {
       int num = 12;  
        int temp = num;
        int n = 0;

        while (temp != 0) {
            temp /= 10;
            n++;
       }
      int sum = 0;
       temp = num;
        
	while (temp != 0) {
           int digit = temp % 10;
            int power = 1;
            for (int i = 0; i < n; i++) {
                power *= digit;
            }
           sum += power;
           temp /= 10;
       }
        System.out.println("Sum of digits raised to power " + n + " = " + sum);
    }
}
