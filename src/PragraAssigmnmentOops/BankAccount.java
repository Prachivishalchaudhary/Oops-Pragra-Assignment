package PragraAssigmnmentOops;

abstract class BankAccount implements TransactionLog{
    protected int accountNumber;
    protected String accountHolderName;
    protected Double balance;

    public abstract double BankAccount(double money);


    public abstract double performTransaction(double money);
    static int newAccount(int account){
        return account;

    }

    public BankAccount(int accountNumber, String accountHolderName, Double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }
}
