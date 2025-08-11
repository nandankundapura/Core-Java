public class BankAccountRunner {
    public static void main(String[] args) {
        Account_Details account = new Account_Details("9876543210", "Current", 50000.00);
        Bank_Details bank = new Bank_Details("HDFC Bank", "Koramangala Branch");

        bank.setAccount(account);

        System.out.println("***** Bank Details *****");
        System.out.println("Bank Name: " + bank.getBankName());
        System.out.println("Branch: " + bank.getBranch());

        System.out.println("***** Account Details *****");
        System.out.println("Account Number: " + bank.getAccount().getAccountNumber());
        System.out.println("Account Type: " + bank.getAccount().getAccountType());
        System.out.println("Balance: ₹" + bank.getAccount().getBalance());
    }
}