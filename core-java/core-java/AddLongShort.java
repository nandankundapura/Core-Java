class AddLongShort 
{
    public static void main(String[] args) {
        addition();                       
        addition(100000L, 50000L);         
        addition((short) 1000, (short) 2000); 
   }
    public static void addition()
 {
        System.out.println("Without argument");
        long a = 15000L;
        long b = 35000L;
        long c = a + b;
        System.out.println("Result (long): " + c);
    }

    public static void addition(long a, long b) 
{
        long c = a + b;
        System.out.println(c);
    }
    public static void addition(short a, short b) {
        int c = a + b;  
        System.out.println(c);
    }
}
