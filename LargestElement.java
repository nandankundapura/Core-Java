class LargestElement {
   public static void main(String[] args) {
    int[] numbers = {18, 14, 01, 08, 81};
      int max = numbers[0];
  for(int i = 1; i < numbers.length; i++) {
    if(numbers[i] > max) {
    max = numbers[i];
    }
   }
  System.out.println("Largest element: " + max);
    }
}
