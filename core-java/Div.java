class Div
{
	public static void main(String[] args)
	{
		Division();
		Division(15,3);

	}
public static void Division()
{
	System.out.println("Without argument");
	int a=100;
	int b=45;
	int c=a/b;
	System.out.println(c);
}
	public static void Division(int a,int b)
{
	System.out.println("With argument");
	int c=a/b;
	System.out.println(c);
}

}