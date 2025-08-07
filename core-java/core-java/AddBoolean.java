class AddBoolean 
{
    public static void main(String[] args)
 {
        addition();
        addition(true, false);
  }
    public static void addition() 
{
        System.out.println("Without argument");
        boolean a = true;
        boolean b = false;
        boolean c = a || b;
        System.out.println("logical OR: " + c);
    }

    public static void addition(boolean a, boolean b) 
{
        boolean c = a || b;
        System.out.println("With boolean arguments: " + c);
    }
}
