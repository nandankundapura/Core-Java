package StringPrograms;

public class PalindromeCheck {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a word as command-line argument.");
            return;
        }

        String str = args[0];
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        if (str.equalsIgnoreCase(rev)) {
            System.out.println(str + " = " + rev + " (Palindrome)");
        } else {
            System.out.println(str + " ≠ " + rev + " (Not Palindrome)");
        }
    }
}
