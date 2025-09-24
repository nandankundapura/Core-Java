interface RBI {
    void getInterestRate();
}

abstract class Bank implements RBI {
    String bankName;
    
    Bank(String bankName) {
        this.bankName = bankName;
    }

    public abstract void getInterestRate();
}

class SBI extends Bank {
    SBI() {
        super("SBI");
    }

    public void getInterestRate() {
        System.out.println(bankName + " Interest Rate: 6.5%");
    }
}

class ICICI extends Bank {
    ICICI() {
        super("ICICI");
    }

    public void getInterestRate() {
        System.out.println(bankName + " Interest Rate: 7.2%");
    }
}

public class BankRunner {
    public static void main(String[] args) {
        Bank sbi = new SBI();
        Bank icici = new ICICI();

        Bank[] banks = new Bank[2];
        banks[0] = sbi;
        banks[1] = icici;

        for (Bank bank : banks) {
            bank.getInterestRate();
        }
    }
}
