
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


public class AccountTest {
    public static void main(String[] args) {
        Account obj1 = new PersonalAccount();  
        Account obj2 = new CurrentAccount();    
    }
}
