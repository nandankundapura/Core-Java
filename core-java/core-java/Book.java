class Book {
    private String title;
    public void setTitle(String t) {
        title = t;
    }
    public String getTitle() {
       return title;
    }
}
class Flight {
    private int flightNumber;

    public void setFlightNumber(int number) {
       flightNumber = number;
    }

    public int getFlightNumber() {
      return flightNumber;
    }
}

class City {
    private String name;

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }
}
class Food {
    private double price;

  public void setPrice(double p) {
        price = p;
   }

    public double getPrice() {
        return price;
    }
}

class Student {
    private int rollNumber;

   public void setRollNumber(int r) {
        rollNumber = r;
    }

  public int getRollNumber() {
    return rollNumber;
    }
}

class Employee {
   private String employeeId;
    public void setEmployeeId(String id) {
        employeeId = id;
    }

    public String getEmployeeId() {
        return employeeId;
    }
}
class Movie {
    private float rating;

 public void setRating(float r) {
      rating = r;
    }

    public float getRating() {
        return rating;
    }
}

class Car {
    private String model;

    public void setModel(String m) {
        model = m;
    }

    public String getModel() {
        return model;
    }
}
class Laptop {
    private int ramSize;
    public void setRamSize(int size) {
        ramSize = size;
    }
    public int getRamSize() {
        return ramSize;
  }
}
class Mobile {
    private long phoneNumber;

    public void setPhoneNumber(long number) {
        phoneNumber = number;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }
}
public class Main {
    public static void main(String[] args) {
        Book b = new Book();
        b.setTitle("Java Programming");
        System.out.println("Book Title: " + b.getTitle());

        Flight f = new Flight();
        f.setFlightNumber(1234);
        System.out.println("Flight Number: " + f.getFlightNumber());

      City c = new City();
        c.setName("Bangalore");
        System.out.println("City Name: " + c.getName());

        Food food = new Food();
        food.setPrice(199.99);
        System.out.println("Food Price: " + food.getPrice());

     Student s = new Student();
        s.setRollNumber(10);
        System.out.println("Student Roll Number: " + s.getRollNumber());

        Employee e = new Employee();
        e.setEmployeeId("EMP001");
        System.out.println("Employee ID: " + e.getEmployeeId());

        Movie m = new Movie();
        m.setRating(4.5f);
        System.out.println("Movie Rating: " + m.getRating());

      Car car = new Car();
        car.setModel("Hyundai i20");
        System.out.println("Car Model: " + car.getModel());

        Laptop l = new Laptop();
        l.setRamSize(16);
        System.out.println("Laptop RAM: " + l.getRamSize() + " GB");

    Mobile mob = new Mobile();
        mob.setPhoneNumber(9876543210L);
        System.out.println("Mobile Number: " + mob.getPhoneNumber());
    }
}
