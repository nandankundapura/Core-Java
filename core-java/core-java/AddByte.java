class AddByte 
{
    public static void main(String[] args) {
        addition();
        addition((byte)5, (byte)10);
    }

    public static void addition() {
        System.out.println("Without argument");
        byte a = 12;
        byte b = 8;
        int c = a + b; 
        System.out.println("Result: " + c);
    }

    public static void addition(byte a, byte b)
    {
        int c = a + b;
        System.out.println("Result: " + c);
    }
}
