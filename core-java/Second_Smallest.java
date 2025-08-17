class Second_Smallest {
    public static void main(String[] arg) {
        
      int[] arr = {10, 20, 30, 40, 50};
        
       int smallest, secondSmallest;

     if (arr[0] < arr[1]) {
           smallest = arr[0];
            secondSmallest = arr[1];
        } else {
            smallest = arr[1];
            secondSmallest = arr[0];
        }

        for (int i = 2; i < arr.length; i++) {
            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] < secondSmallest && arr[i] != smallest) {
                secondSmallest = arr[i];
          }
      }
        
     System.out.println("Second smallest " + secondSmallest);
    }
}
