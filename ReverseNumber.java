package StringPrograms;

public class ReverseNumber {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a number as command-line argument.");
            return;
        }

        String input = args[0];
        int num = 0;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c >= '0' && c <= '9') {
                num = num * 10 + (c - '0');
            } else {
                System.out.println("Invalid input. Enter digits only.");
                return;
            }
        }

        int rev = 0;
        while (num != 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }

        System.out.println("Reversed number = " + rev);
    }
}
