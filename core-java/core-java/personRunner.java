public class personRunner
 {
    public static void main(String[] args)
 {
        Person person1 = new Person();
      person1.setName("Dhanush");
        person1.setAge(22);
        person1.setGender("Male");
        System.out.println("Name "+ person1.getName());
        System.out.println("Age "+ person1.getAge());
        System.out.println("Gender "+ person1.getGender());
    }
}
