public class Product {
    private String name;
    private int id;
    private String category;
    private double price;
    private String manufacturer;

    public Product(String name) {
        this.name = name;
        System.out.println("Initializing name");
    }

    public Product(String name, int id) {
        this(name);
        this.id = id;
        System.out.println("Initializing id");
    }

    public Product(String name, int id, String category) {
        this(name, id);
        this.category = category;
        System.out.println("Initializing category");
    }

    public Product(String name, int id, String category, double price) {
        this(name, id, category);
        this.price = price;
        System.out.println("Initializing price");
    }

    public Product(String name, int id, String category, double price, String manufacturer) {
        this(name, id, category, price);
        this.manufacturer = manufacturer;
        System.out.println("Initializing manufacturer");
    }

    public String getName() { return name; }
    public int getId() { return id; }
    public String getCategory() { return category; }
    public double getPrice() { return price; }
    public String getManufacturer() { return manufacturer; }
}
