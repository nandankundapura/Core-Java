public class DataArray {
    public static void main(String[] args) {
        IntArray intArray = new IntArray();
       FloatArray floatArray = new FloatArray();
        DoubleArray doubleArray = new DoubleArray();
        LongArray longArray = new LongArray();
       ShortArray shortArray = new ShortArray();
        ByteArray byteArray = new ByteArray();
        CharArray charArray = new CharArray();
        BooleanArray booleanArray = new BooleanArray();
        StringArray stringArray = new StringArray();

   intArray.print();
      floatArray.print();
        doubleArray.print();
       longArray.print();
        shortArray.print();
        byteArray.print();
        charArray.print();
        booleanArray.print();
        stringArray.print();
   }
}

class IntArray {
    int[] data = {14, 14, 14, 14, 14, 14, 14, 14, 14, 14};
    void print() {
        System.out.println("Int Array:");
        for (int i=0; i<data.length; i++) {
      System.out.println("Index " + i + ": " + data[i]);
     }
    }
}

class FloatArray {
    float[] data = {14f, 14f, 14f, 14f, 14f, 14f, 14f, 14f, 14f, 14f};
    void print() {
     System.out.println("\nFloat Array:");
       for (int i = 0; i<data.length; i++) {
            System.out.println("Index " + i + ": " + data[i]);
    }
    }
}

class DoubleArray {
    double[] data = {14.0, 14.0, 14.0, 14.0, 14.0, 14.0, 14.0, 14.0, 14.0, 14.0};
    void print() {
        System.out.println("\nDouble Array:");
        for (int i=0; i<data.length;i++) {
            System.out.println("Index " + i + ": " + data[i]);
     }
    }
}

class LongArray {
    long[] data = {14L, 14L, 14L, 14L, 14L, 14L, 14L, 14L, 14L, 14L};
    void print() {
        System.out.println("\nLong Array:");
        for (int i=0; i<data.length;i++) {
            System.out.println("Index " + i + ": " + data[i]);
    }
    }
}

class ShortArray {
    short[] data = {14, 14, 14, 14, 14, 14, 14, 14, 14, 14};
    void print() {
        System.out.println("\nShort Array:");
        for (int i=0;i<data.length;i++) {
            System.out.println("Index " + i + ": " + data[i]);
        }
    }
}

class ByteArray {
    byte[] data = {14, 14, 14, 14, 14, 14, 14, 14, 14, 14};
    void print() {
        System.out.println("\nByte Array:");
        for (int i=0;i<data.length;i++) {
            System.out.println("Index " + i + ": " + data[i]);
      }
    }
}
class CharArray {
    char[] data = {'E', 'E', 'E', 'E', 'E', 'E', 'E', 'E', 'E', 'E'};
    void print() {
        System.out.println("\nChar Array:");
        for (int i= 0;i <data.length;i++) {
       System.out.println("Index " + i + ": " + data[i]);
    }
}
}
class BooleanArray {
    boolean[] data = {true, true, true, true, true, true, true, true, true, true};
     void print() {
        System.out.println("\nBoolean Array:");
        for (int i=0; i<data.length;i++) {
           System.out.println("Index " + i + ": " + data[i]);
    }
    }
}

class StringArray {
    String[] data = {"14", "14", "14", "14", "14", "14", "14", "14", "14", "14"};
    void print() {
        System.out.println("\nString Array:");
        for (int i=0;i< data.length;i++) {
          System.out.println("Index " + i + ": " + data[i]);
   }
   }
}
