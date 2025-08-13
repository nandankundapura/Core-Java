public class MoveZeros {
    public static void main(String[] args) {
        int[] arr = {0, 2, 0, 3, 4};
        int index = 0;

        for (int num : arr) {
            if (num != 0) {
                arr[index++] = num;
            }
        }

        while (index < arr.length) {
            arr[index++] = 0;
        }

        System.out.print("After moving zeros: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
