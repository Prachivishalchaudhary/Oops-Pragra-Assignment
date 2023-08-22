package PragraAssigmnmentOops;

public class CheckingAccount extends BankAccount{


    public CheckingAccount(int accountNumber, String accountHolderName, Double balance) {
        super(accountNumber, accountHolderName, balance);
    }

    public double interestRate(double interest){
        return interest;
    }
    public double overdraftLimit(double limit ) {
        return limit;
    }

    @Override
    public void performTransaction() {

    }

    @Override
    public void logTransaction() {

    }

    @Override
    public void getTransactionHistory() {

    }
}
