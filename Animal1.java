package StringPrograms;

public class Animal1 {
    abstract void sound();

    void eat() {
        System.out.println("This animal is eating...");
    }
}

class Dog extends Animal1 {
    @Override
    void sound() {
        System.out.println("Dog barks: Woof Woof!");
    }
}


public class Runner {
    public static void main(String[] args) {

        Animal1 myDog = new Dog();


        myDog.sound();


        myDog.eat();
    }
}
