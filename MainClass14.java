class Laptops1 
{
    static String brand = "HP";
    static String model = "H1";
    static int price = 60000;
    static int ram = 8;
    static String processor = "i5";

  public static void showDetails() 
{
        String brand = "Dell";
        String model = "Z1";
        int price = 50000;
        int ram = 8;
        String processor = "i3";

        System.out.println("Laptop1 - L: " + brand + ", " + model + ", " + price + ", " + ram + "GB, " + processor);
        System.out.println("Laptop1 - S: " + Laptops1.brand + ", " + Laptops1.model + ", " + Laptops1.price + ", " + Laptops1.ram + "GB, " + Laptops1.processor);
    }
}

class Mobiles
 {
    static String brand = "Samsung";
    static String model = "Galaxy";
    static int price = 14000;
    static int ram = 6;
    static String os = "Android";

    public static void showDetails() {
        String brand = "Realme";
        String model = "Narzo 60";
        int price = 16000;
        int ram = 8;
        String os = "Android 13";

        System.out.println("Mobile -L: " + brand + ", " + model + ", " + price + ", " + ram + "GB, " + os);
        System.out.println("Mobile -S: " + Mobiles.brand + ", " + Mobiles.model + ", " + Mobiles.price + ", " + Mobiles.ram + "GB, " + Mobiles.os);
    }
}

class Books
 {
    static String title = "Java";
    static String author = "Nandan";
    static int pages = 550;
    static String publisher = "SwapnaBook";
    static int price = 500;

    public static void showDetails() {
        String title = "Python";
        String author = "Bharth";
        int pages = 300;
        String publisher = "CodeBook";
        int price = 600;

        System.out.println("Book -L: " + title + ", " + author + ", " + pages + " pages, " + publisher + ", " + price);
        System.out.println("Book-S: " + Books.title + ", " + Books.author + ", " + Books.pages + " pages, " + Books.publisher + ", " + Books.price);
    }
}
class Cars {
    static String brand = "Toyota";
    static String model = "Innova";
    static int price = 2000000;
    static String fuel = "Diesel";
    static int seats =7;

    public static void showDetails() {
        String brand = "Hyundai";
        String model = "i20";
        int price = 900000;
        String fuel = "Petrol";
        int seats = 5;

        System.out.println("Car-L: " + brand + ", " + model + ", " + price + ", " + fuel + ", " + seats + " seats");
        System.out.println("Car -S: " + Cars.brand + ", " + Cars.model + ", " + Cars.price + ", " + Cars.fuel + ", " + Cars.seats + " seats");
    }
}
class Students
 {
    static String name = "Bharath";
    static int age = 22;
    static String course = "MCA";
    static String college = "GIMS";
    static float cgpa = 8.51f;

    public static void showDetails() {
        String name = "Ashok";
        int age = 21;
        String course = "BCA";
        String college = "GMIT";
        float cgpa = 9.2f;

      System.out.println("Student - L: " + name + ", " + age + ", " + course + ", " + college + ", CGPA: " + cgpa);
       System.out.println("Student-S: " + Students.name + ", " + Students.age + ", " + Students.course + ", " + Students.college + ", CGPA: " + Students.cgpa);
    }
}

public class MainClass14
 {
    public static void main(String[] args)
 {
        Laptops1.showDetails();
        System.out.println("-------");

        Mobiles.showDetails();
        System.out.println("------");

        Books.showDetails();
        System.out.println("----");

        Cars.showDetails();
        System.out.println("-----");

        Students.showDetails();
	System.out.println("----");
    }
}
