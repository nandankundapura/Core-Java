public class FindInPrimitiveArrays {
    public static void main(String[] args) {

      int[] intArr = new int[5];
        intArr[0] = 10;
        intArr[1] = 20;
        intArr[2] = 30;
        intArr[3] = 40;
        intArr[4] = 50;
        int keyInt = 30;
        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i] == keyInt) {
            System.out.println("int: " + keyInt + " found at index " + i);
            }
        }

     float[] floatArr = new float[3];
     floatArr[0] = 1.1f;
     floatArr[1] = 2.2f;
        floatArr[2] = 3.3f;
        float keyFloat = 2.2f;
        for (int i = 0; i < floatArr.length; i++) {
            if (floatArr[i] == keyFloat) {
                System.out.println("float: " + keyFloat + " found at index " + i);
            }
        }

        char[] charArr = new char[3];
        charArr[0] = 'a';
        charArr[1] = 'b';
        charArr[2] = 'c';
        char keyChar = 'b';
        for (int i = 0; i < charArr.length; i++) {
            if (charArr[i] == keyChar) {
                System.out.println("char: '" + keyChar + "' found at index " + i);
            }
        }

      double[] doubleArr = new double[3];
      doubleArr[0] = 5.5;
      doubleArr[1] = 6.6;
        doubleArr[2] = 7.7;
        double keyDouble = 6.6;
        for (int i = 0; i < doubleArr.length; i++) {
            if (doubleArr[i] == keyDouble) {
                System.out.println("double: " + keyDouble + " found at index " + i);
            }
        }
        boolean[] boolArr = new boolean[3];
     boolArr[0] = true;
     boolArr[1] = false;
     boolArr[2] = true;
        boolean keyBool = false;
        for (int i = 0; i < boolArr.length; i++) {
            if (boolArr[i] == keyBool) {
                System.out.println("boolean: " + keyBool + " found at index " + i);
           }
        }
    }
}
