class BagRunner {
    public static void main(String[] args) {
        Bag bag = new Bag(); 
        System.out.println(bag.getBrand());
        bag.setBrand("Wildcraft");
        String brand = bag.getBrand();
        System.out.println(brand);

        System.out.println("___________________________________________________");

        Bag bag1 = new Bag("American Tourister", 30); 
        System.out.println(bag1.getBrand());
        System.out.println(bag1.getCapacity());
        bag1.setCapacity(40);
        System.out.println(bag1.getCapacity());
    }
}	