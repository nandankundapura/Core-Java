class AddFloat 
{
    public static void main(String[] args) {
        addition();
        addition(4.5f, 2.3f);
    }

    public static void addition() 
{
        System.out.println("Without argument");
        float a = 3.5f;
        float b = 6.5f;
        float c = a + b;
        System.out.println("result: " + c);
    }
    public static void addition(float a, float b) 
{
        float c = a + b;
        System.out.println("With float arguments: " + c);
    }
}
