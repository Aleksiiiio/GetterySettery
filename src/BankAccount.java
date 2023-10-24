public class BankAccount {
    private String accountNumber;
    private double accountBalance;

    public BankAccount(String accountNumber, double accountBalance) {
            this.accountNumber = accountNumber;
        if (accountBalance >= 0) {
            this.accountBalance = accountBalance;
        }
    }
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public double deposit(double depositAmount) {
        if (depositAmount > 0) {
            accountBalance += depositAmount;
        }
        return accountBalance;
    }

    public void withdraw(double withdrawAmount){
        if (withdrawAmount > 0 && withdrawAmount <= accountBalance){
            accountBalance -= withdrawAmount;
        }
    }

}
