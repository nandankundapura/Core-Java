package StringPrograms;

public class WildAnimal {
    void hunt() {
        System.out.println("Wild animals hunt for food");
    }
}


class Lion extends WildAnimal {
    void hunt() {
        System.out.println("Lion hunts deer");
    }
}

class Tiger extends WildAnimal {
    void hunt() {
        System.out.println("Tiger hunts boar");
    }
}


class WildAnimalRunner {
    public static void main(String[] args) {
        WildAnimal lion = new Lion();
        lion.hunt();

        WildAnimal tiger = new Tiger();
        tiger.hunt();
    }
}
