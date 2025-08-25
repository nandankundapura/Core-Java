
class Mobile {
    Mobile() {
        System.out.println("This is a Mobile");
    }
}
class Android extends Mobile {
    Android() {
        System.out.println("This is an Android Mobile");
    }
}

class IOS extends Mobile {
    IOS() {
        System.out.println("This is an iOS Mobile");
    }
}


public class Mobiles {
    public static void main(String[] args) {
        Mobile android = new Android();   
        Mobile ios = new IOS();           
    }
}

