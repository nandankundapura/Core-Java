class Animals {
    private String name;
    private int age;
    private String type;

  public Animals() {
        System.out.println("No-argument constructor called.");
    }

  public Animals(String name, int age, String type) {
        System.out.println("Parameterized constructor called.");
        this.name = name;
        this.age = age;
        this.type = type;
    }
 public void setName(String name) {
        this.name = name;
  }

    public void setAge(int age) {
        this.age = age;
   }

    public void setType(String type) {
        this.type = type;
    }
   public void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", Type: " + type);
    }
}

public class Main {
    public static void main(String[] args) {

   System.out.println("5 Objects with No-Argument Constructor");
      Animals a1 = new Animal();
       a1.setName("Lion");
        a1.setAge(5);
       a1.setType("Wild");
        a1.display();

    Animals a2 = new Animal();
     a2.setName("Dog");
       a2.setAge(3);
       a2.setType("Domestic");
        a2.display();

      Animals a3 = new Animal();
       a3.setName("Elephant");
        a3.setAge(10);
        a3.setType("Wild");
        a3.display();

   Animals a4 = new Animal();
     a4.setName("Cat");
    a4.setAge(2);
     a4.setType("Pet");
       a4.display();

        Animals a5 = new Animal();
        a5.setName("Cow");
        a5.setAge(4);
        a5.setType("Farm");
        a5.display();

     System.out.println("\n 5 Objects with Parameterized Constructor ");
      Animals b1 = new Animal("Horse", 7, "Domestic");
     b1.display();
      b1.setName("Zebra");
      b1.setAge(8);
        b1.setType("Wild");
        b1.display();

      Animals b2 = new Animal("Fox", 4, "Wild");
        b2.display();
        b2.setName("Wolf");
        b2.setAge(6);
        b2.setType("Wild");
        b2.display();

        Animals b3 = new Animal("Rabbit", 2, "Pet");
        b3.display();
        b3.setName("Hamster");
        b3.setAge(1);
        b3.setType("Pet");
        b3.display();

        Animals b4 = new Animal("Goat", 3, "Farm");
        b4.display();
        b4.setName("Sheep");
        b4.setAge(4);
        b4.setType("Farm");
        b4.display();

        Animals b5 = new Animal("Peacock", 5, "Bird");
        b5.display();
        b5.setName("Parrot");
        b5.setAge(2);
        b5.setType("Bird");
        b5.display();
    }
}
