public class ProductRunner {
    public static void main(String[] args) {
        Product p1 = new Product("Phone", 101, "Electronics", 699.99, "Samsung");
        Product p2 = new Product("Laptop", 102, "Electronics", 999.99, "HP");
        Product p3 = new Product("Bottle", 103, "Kitchen", 15.50, "Milton");
        Product p4 = new Product("Shoes", 104, "Footwear", 49.99, "Nike");
        Product p5 = new Product("Chair", 105, "Furniture", 85.00, "IKEA");

        System.out.println(p1.getName());
        System.out.println(p2.getPrice());
        System.out.println(p3.getCategory());
        System.out.println(p4.getManufacturer());
        System.out.println(p5.getId());
    }
}
