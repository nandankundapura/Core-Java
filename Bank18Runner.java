public class Bank18Runner {
    public static void main(String[] args) {
        Bank18[] banks = new Bank18[5];

        Bank18 b1 = new Bank18();
        b1.setName("State Bank of India");
        b1.setBranch("BTM Layout");

        Bank18 b2 = new Bank18();
        b2.setName("HDFC Bank");
        b2.setBranch("Jayanagar");

        Bank18 b3 = new Bank18();
        b3.setName("ICICI Bank");
        b3.setBranch("Koramangala");

        Bank18 b4 = new Bank18();
        b4.setName("Canara Bank");
        b4.setBranch("Indiranagar");

        Bank18 b5 = new Bank18();
        b5.setName("Axis Bank");
        b5.setBranch("MG Road");

    for (int i = 0; i < banks.length; i++) {
            if (i == 0) {
                banks[i] = b1;
            } else if (i == 1) {
                banks[i] = b2;
            } else if (i == 2) {
                banks[i] = b3;
         } else if (i == 3) {
                banks[i] = b4;
            } else if (i == 4) {
                banks[i] = b5;
            }
        }

        for (int i = 0; i < banks.length; i++) {
            Bank18 bank = banks[i];
            if (bank != null) {
               System.out.println(bank.getName());
                System.out.println(bank.getBranch());
                System.out.println("----------");
        }
        }
    }
}
