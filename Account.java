class Account {
    Account() {
        System.out.println("This is a general Account");
    }
}

class PersonalAccount extends Account {
    PersonalAccount() {
        System.out.println("This is a Personal Account");
    }
}

class CurrentAccount extends Account {
    CurrentAccount() {
        System.out.println("This is a Current Account");
    }
}

public class HierarchicalDemo1 {
    public static void main(String[] args) {
        PersonalAccount pa = new PersonalAccount();
        CurrentAccount ca = new CurrentAccount();
    }
}
