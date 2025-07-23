class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Animal - Name: " + name + ", Age: " + age);
  }

  public void setName(String name) { this.name = name; }
   public void setAge(int age) { this.age = age; }

    public void printDetails() {
        System.out.println(" Animal  Name: " + name + ", Age: " + age);
    }
}

class Car {
    private String brand;
    private int year;

    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
        System.out.println("Car  Brand: " + brand + ", Year: " + year);
    }

   public void setBrand(String brand) { this.brand = brand; }
    public void setYear(int year) { this.year = year; }

    public void printDetails() {
        System.out.println("Updated Car - Brand: " + brand + ", Year: " + year);
    }
}

   class Student {
    private String name;
   private int rollNo;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
        System.out.println("Student Name: " + name + ", Roll No: " + rollNo);
    }

    public void setName(String name) { this.name = name; }
  public void setRollNo(int rollNo) { this.rollNo = rollNo; }

    public void printDetails() {
        System.out.println(" Student - Name: " + name + ", Roll No: " + rollNo);
    }
}

class Book {
    private String title;
    private double price;

    public Book(String title, double price) {
        this.title = title;
        this.price = price;
        System.out.println("Book Title: " + title + ", Price: ₹" + price);
    }

 public void setTitle(String title) {
 this.title = title; 
}
    public void setPrice(double price) { 
this.price = price;
 }

    public void printDetails() {
        System.out.println("Updated Book - Title: " + title + ", Price: ₹" + price);
    }
}

class Product
 {
    private String name;
    private int quantity;

    public Product(String name, int quantity) {
      this.name = name;
        this.quantity = quantity;
      System.out.println("Product  Name: " + name + ", Quantity: " + quantity);
   }

  public void setName(String name) { this.name = name; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public void printDetails() {
        System.out.println("Updated Product - Name: " + name + ", Quantity: " + quantity);
    }
}
