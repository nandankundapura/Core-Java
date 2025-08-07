class Multi
{
	public static void main(String[] args)
	{
		Multiplication();
		Multiplication(5,2);

	}
public static void Multiplication()
{
	System.out.println("Without argument");
	int a=100;
	int b=45;
	int c=a*b;
	System.out.println(c);
}
public static void Multiplication(int a,int b)
{
	System.out.println();
	int c=a*b;
	System.out.println(c);
}
}