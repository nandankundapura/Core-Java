public class PatternOddNumbers {
    public static void main(String[] args) {
        int rows = 2;
        int columns = 4;

        for (int i = 0; i < rows; i++) {
            int odd = 1;
            for (int j = 0; j < columns; j++) {
                System.out.print(odd + " ");
                odd += 2;
            }
         System.out.println();
     }
    }
}
