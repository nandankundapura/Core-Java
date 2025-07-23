class AddLong
 {
    public static void main(String[] args) {
        addition();
        addition(100000L, 200000L);
    }

    public static void addition() {
        System.out.println("Without argument");
        long a = 500000L;
        long b = 250000L;
        long c = a + b;
        System.out.println("result: " + c);
    }

    public static void addition(long a, long b) {
        long c = a + b;
        System.out.println("With long arguments: " + c);
    }
}
