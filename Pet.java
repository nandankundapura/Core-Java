package StringPrograms;

public class Pet {
    void play() {
        System.out.println("Pets like to play");
    }
}


class Parrot extends Pet {
    void play() {
        System.out.println("Parrot plays by talking");
    }
}

class Rabbit extends Pet {
    void play() {
        System.out.println("Rabbit hops playfully");
    }
}


class PetRunner {
    public static void main(String[] args) {
        Pet parrot = new Parrot();
        parrot.play();

        Pet rabbit = new Rabbit();
        rabbit.play();
    }
}
