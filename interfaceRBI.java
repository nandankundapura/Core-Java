interface RBI {
    void getInterestRate();
}


class SBI implements RBI {
    public void getInterestRate() {
        System.out.println("SBI Interest Rate: 6.5%");
    }
}


class ICICI implements RBI {
    public void getInterestRate() {
        System.out.println("ICICI Interest Rate: 7.2%");
    }
}


public class BankRunner {
    public static void main(String[] args) {
        
        RBI sbi = new SBI();
        RBI icici = new ICICI();

    
        RBI[] banks = new RBI[2];
        banks[0] = sbi;
        banks[1] = icici;

       
        for (RBI bank : banks) {
            bank.getInterestRate();
        }
    }
}
