class IntArray {
  static int[] arr = {1, 2, 3, 4, 5};

   static void print() {
    System.out.print("IntArray: ");
     for (int i = 0; i < arr.length; i++) {
     System.out.print(arr[i] + " ");
    }
    System.out.println();
    }
}

class FloatArray {
  static float[] arr = {1.1f, 2.2f, 3.3f};

   static void print() {
      System.out.print("FloatArray: ");
     for (int i = 0; i < arr.length; i++) {
       System.out.print(arr[i] + " ");
    }
      System.out.println();
    }
}

class CharArray {
    static char[] arr = {'A', 'B', 'C', 'D'};
   static void print() {
     System.out.print("CharArray: ");
     for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

class BooleanArray {
   static boolean[] arr = {true, false, true, false};
    static void print() {
    System.out.print("BooleanArray: ");
       for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
        }
    System.out.println();
    }
}

