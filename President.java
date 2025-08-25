class President {
    President() {
        System.out.println("I am the President");
    }
}

class PrimeMinister extends President {
    PrimeMinister() {
        System.out.println("I am the Prime Minister");
    }
}

class ChiefMinister extends PrimeMinister {
    ChiefMinister() {
        System.out.println("I am the Chief Minister");
    }
}

public class MultilevelDemo2 {
    public static void main(String[] args) {
        ChiefMinister obj = new ChiefMinister();      }
}
