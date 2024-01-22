
/*
An account can only be a BasicFlatAccount, TransFeeAccount, StrangeAccount
The Account class is an abstract superclass with the default characteristics of a bank account. 
 i.e., it maintains a balance  and a current number of transactions.
 There are default account implementation for deposit(), withdraw(),
 and endMonth(), the latter printing out the end-month-summary. 
 to get specific end of month information, the endMonthCharge() method is abstract, and so must
 be implemented by each subclass.
*/

public abstract class Account {

    private double balance;
    private int transactions;

    public Account(double balance) {
        this.balance = balance;
        transactions = 0;
    }

    // Withdraws the given amount and counts a transaction
    public void withdraw(double amount) {
        balance = balance - amount;
        transactions++;
    }

    // Deposits the given amount and counts a transaction
    public void deposit(double amount) {
        balance = balance + amount;
        transactions++;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getAccountType() {
        // we use the class name of the subclass!
        String classtype = getClass().toString();
        // the class name is Class Fee etc. Fee is what we want
        // Hence taking out 6 chars at the beginning
        String st = classtype.substring(6);
        return st;
    }

    /*
     * Sent to the account at the end of the month so
     * it can settle fees and print a summary.
     * Relies on the endMonthCharge() method for
     * each class to implement its own charge policy.
     * Then does the common account printing and maintenance.
     */
    public void endMonth() {
        // Get the subclass to perform their specific charge policy (using abstract method)
        ProcessEndMonthCharge();
        String st = "";
        st += "Account: " + getAccountType();
        st += " Balance: " + this.balance + " Transaction No: " + this.transactions;
        System.out.println(st);
        transactions = 0;
    }

    /*
     * Applies the end-of-month charge to the account.
     * This is "abstract" so subclasses must override
     * and provide this inforamtion. At run time, teh sublcass 
     * will provide that information.
     */
    protected abstract void ProcessEndMonthCharge();
}