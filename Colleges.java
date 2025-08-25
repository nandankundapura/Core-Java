class Colleges {
    Colleges() {
        System.out.println("This is a Colleges");
    }
}

class Branch extends Colleges {
    Branch() {
        System.out.println("This is a Branch");
    }
}

class Students extends Branch {
    Students() {
        System.out.println("These are Students");
    }
}

public class MultilevelDemo3 {
    public static void main(String[] args) {
        Students obj = new Students();   // prints automatically
    }
}
