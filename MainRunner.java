public class MainRunner 
{
    public static void main(String[] args)
 {
      Animal animal = new Animal("Tiger", 4);
       Car car = new Car("Honda", 2020);
        Student student = new Student("Nandan", 101);
        Book book = new Book("Java Basics", 499.99);
        Product product = new Product("Mobile", 5);

        System.out.println("\n------- After Values ---");

     animal.setName("Lion");
      animal.setAge(5);
    animal.printDetails();

       car.setBrand("Hyundai");
     car.setYear(2023);
        car.printDetails();

      student.setName("Ravi");
      student.setRollNo(202);
     student.printDetails();

  book.setTitle("Advanced Java");
   book.setPrice(599.50);
   book.printDetails();

    product.setName("Laptop");
      product.setQuantity(2);
     product.printDetails();
    }
}
