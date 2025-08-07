class Car 
{
    static String brand = "Toyota";

    public static void showBrand() 
{
        System.out.println (brand);
    }
}
class Bike
 {
    static String model = "Royal Enfield";

    public static void showModel()
 {
        System.out.println(model);
    }
}
class Laptop 
{
    static String brand = "Dell";

    public static void showBrand() 
{
        System.out.println(brand);
    }
}
class Mobile
 {
    static String name = "Nothing Phone 2a";

    public static void showName() 
{
        System.out.println(name);
    }
}

class Book 
{
    static String title = "Java Programming";

    public static void showTitle() 
   {
        System.out.println(title);
   }
}

public class MainClass 
{
    public static void main(String[] args) 
{
        Car.showBrand();
        Bike.showModel();
        Laptop.showBrand();
        Mobile.showName();
        Book.showTitle();
    }
}
