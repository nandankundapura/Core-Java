class Laptops{
	static String name="Dell";
	static int ram=8;
	static Boolean stock=true;
	
public static void main(String[] args)
{
	String name="";
	System.out.println(Laptops.name);
	System.out.println("name"+ name);
	name="Dell";
	System.out.println("name" + name);
	System.out.println(ram);
	features();
	manufacture();
	available();
}
public static void features()
{
	System.out.println("the ram of the laptop is " + ram);
}
public static void manufacture()
{
	System.out.println("the name of the laptop is " + name);
}
public static void available()
{
	System.out.println("the stock of the laptop " + stock);
}
}



