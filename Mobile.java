class Mobile {
    Mobile() {
        System.out.println("This is a Mobile");
    }
}

class Android extends Mobile {
    Android() {
        System.out.println("This is Android");
    }
}

class IOS extends Mobile {
    IOS() {
        System.out.println("This is iOS");
    }
}

public class HierarchicalDemo2 {
    public static void main(String[] args) {
        Android a = new Android();
        IOS i = new IOS();
    }
}
