class Bank_Details {
    private String bankName;
    private String branch;
    private Account_Details account;

    public Bank_Details(String bankName, String branch) {
        this.bankName = bankName;
        this.branch = branch;
    }

    public void setAccount(Account_Details account) {
        this.account = account;
    }

    public Account_Details getAccount() {
        return account;
    }

    public String getBankName() {
        return bankName;
    }

    public String getBranch() {
        return branch;
    }
}