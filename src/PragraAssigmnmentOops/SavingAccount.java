package PragraAssigmnmentOops;

public class SavingAccount extends BankAccount{


    public SavingAccount(int accountNumber, String accountHolderName, Double balance) {
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
