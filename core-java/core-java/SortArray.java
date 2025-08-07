public class SortArray {
    public static void main(String[] args) {
        int[] numbers = {50, 20, 10, 40, 30}; 
        System.out.println("Original Array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        } for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
              if (numbers[i] > numbers[j]) {
              int temp = numbers[i];
             numbers[i] = numbers[j];
           numbers[j] = temp;
       }
    }
   }

   System.out.println("\nSorted Array in Ascending Order:");
        for (int num : numbers) {
        System.out.print(num + " ");
      }
    }
}
