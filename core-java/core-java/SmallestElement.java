class SmallestElement {
 public static void main(String[] args) {
    int[] numbers = {14, 18, 07, 45, 34};
     int min = numbers[0];

  for(int i = 1; i < numbers.length; i++) {
    if(numbers[i] < min) {
   min = numbers[i];
   }
   }
    System.out.println("Smallest element: " + min);
    }
}
