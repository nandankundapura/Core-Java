public class MobilePhone
 {
    static String model = "Nothing Phone 2a";
    static int price = 25999;
    static float screenSize = 6.7f;
    static double battery = 5000.0;
    static boolean inStock = true;
    static char rating = 'A';

public static String nameOfPhone() 
{
        return model;
    }

 public static int priceOfPhone() 
{
        return price;
    }

 public static float sizeOfScreen()
 {
        return screenSize;
    }

 public static double batteryOfPhone()
 {
        return battery;
    }

 public static boolean isInStock() 
{
        return inStock;
    }

  public static char ratingOfPhone() 
{
        return rating;
    }

  public static void main(String[] args) 
{
       System.out.println("Model: " + nameOfPhone());
       System.out.println("Price: " + priceOfPhone());
       System.out.println("Screen Size: " + sizeOfScreen());
        System.out.println("Battery: " + batteryOfPhone());
       System.out.println("In Stock: " + isInStock());
       System.out.println("Rating: " + ratingOfPhone());
    }
}
