class Bag {
    private String brand;
    private int capacity;

    public Bag() {
        System.out.println("No-argument constructor / Default constructor");
        this.brand = "Skybags";
    }
    public Bag(String brand, int capacity) {
        System.out.println("Parameterized constructor with two parameters");
        this.brand = brand;
        this.capacity = capacity;
  }
public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
   }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
  }

 public int getCapacity() {
        return capacity;
    }
}