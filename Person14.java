public class Person14 {
    private String name;
    private int age;
    public Person14(String name, int age) {
        this.name = name;
        this.age = age;
    }
  public void eligibleForVoting() {
    if (age < 0) {
     System.out.println("Invalid age: Age is negative " + name );
    } else if (age > 120) {
      System.out.println("Invalid age: " + name + " age is high");
   } else if (age >= 18) {
       System.out.println("" + name + " is eligible to vote. 🗳️");
      } else {
         System.out.println("" + name + " is NOT eligible to vote, Minimum age is 18.");
        }
    }
  public static void main(String[] args) {
    Person person1 = new Person("Prajwal", 35);
       Person person2 = new Person("Krishna", 16);
        Person person3 = new Person("Kishan", -3);
        Person person4 = new Person("Shiva", 140);

    person1.eligibleForVoting();
      person2.eligibleForVoting();
        person3.eligibleForVoting();
        person4.eligibleForVoting();
    }
}
