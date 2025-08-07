class Bike2
{
	static String name;
	static float price;
    	static float milage;
    	static String color;
    	static String company;
	public static void main(String[] args)
{
	 name="abc";
	 price=1000.2f;;
	 milage=65.5f;;
	 color="Blue";
	 company="Hero";

	System.out.println("Name: " + nameofBike2());
        System.out.println("Price: " + priceofBike2());
        System.out.println("Milage: " + milageofBike2());
        System.out.println("Color: " + colorofBike2());
        System.out.println("Company: " + companyofBike2());
}
	public static String nameofBike2(){
	return name;
}
	public static float priceofBike2(){
	return price;
}
	public static float milageofBike2(){
	return milage;
}
	public static String colorofBike2(){
	return color;
}
	public static String companyofBike2(){
	return company;
}
}
	