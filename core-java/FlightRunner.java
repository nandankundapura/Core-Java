class FlightRunner {
    public static void main(String[] args) {
        Flight[] flights = new Flight[5];
        for (int i = 0; i < flights.length; i++) {
         flights[i] = new Flight();
         flights[i].setTitle("Flight Title " + (i + 1));
        }
        for (Flight f : flights) {
            System.out.println("Flight Title: " + f.getTitle());
      }
    }
}
class BookRunner {
    public static void main(String[] args) {
      Book[] books = new Book[5];
        for (int i = 0; i < books.length; i++) {
         books[i] = new Book();
            books[i].setFlightNumber(1000 + i);
        }
        for (Book b : books) {
            System.out.println("Flight Number: " + b.getFlightNumber());
   }
   }
}
class CityRunner {
    public static void main(String[] args) {
        City[] cities = new City[5];
        for (int i = 0; i < cities.length; i++) {
            cities[i] = new City();
            cities[i].setName("City" + (i + 1));
        }
        for (City c : cities) {
        System.out.println("City Name: " + c.getName());
     }
    }
}

class FoodRunner {
    public static void main(String[] args) {
        Food[] foods = new Food[5];
        for (int i = 0; i < foods.length; i++) {
            foods[i] = new Food();
         foods[i].setPrice(50.0 + i * 10);
        }
        for (Food f : foods) {
            System.out.println("Price: " + f.getPrice());
        }
  }
}

class StudentRunner {
    public static void main(String[] args) {
        Student[] students = new Student[5];
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
            students[i].setRollNumber(101 + i);
        }
        for (Student s : students) {
        System.out.println("Roll Number: " + s.getRollNumber());
    }
    }
}

class EmployeeRunner {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        for (int i = 0; i < employees.length; i++) {
            employees[i] = new Employee();
         employees[i].setEmployeeId("EMP" + (i + 1));
        }
        for (Employee e : employees) {
            System.out.println("Employee ID: " + e.getEmployeeId());
     }
    }
}

class MovieRunner {
    public static void main(String[] args) {
        Movie[] movies = new Movie[5];
        for (int i = 0; i < movies.length; i++) {
            movies[i] = new Movie();
            movies[i].setRating(3.0f + i);
        }
        for (Movie m : movies) {
      System.out.println("Rating: " + m.getRating());
    }
 }
}

class CarRunner {
    public static void main(String[] args) {
        Car[] cars = new Car[5];
        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car();
            cars[i].setModel("Model" + (i + 1));
        }
        for (Car c : cars) {
         System.out.println("Model: " + c.getModel());
     }
    }
}

class LaptopRunner {
    public static void main(String[] args) {
        Laptop[] laptops = new Laptop[5];
        for (int i = 0; i < laptops.length; i++) {
        laptops[i] = new Laptop();
        laptops[i].setRamSize(4 + i * 2);
        }
        for (Laptop l : laptops) {
            System.out.println("RAM Size: " + l.getRamSize() + " GB");
      }
    }
}

class MobileRunner {
    public static void main(String[] args) {
        Mobile[] mobiles = new Mobile[5];
        for (int i = 0; i < mobiles.length; i++) {
            mobiles[i] = new Mobile();
            mobiles[i].setPhoneNumber(9876543210L + i);
        }
        for (Mobile m : mobiles) {
            System.out.println("Phone Number: " + m.getPhoneNumber());
     }
    }
}
