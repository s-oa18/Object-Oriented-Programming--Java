import java.util.Random;

public class AccountTest {

    // ----
    // Demo Code
    // ----
    // Allocate a Random object shared by these static methods
    private static Random rand = new Random();

    // Return a new random account of a random type.
    private static Account randomAccount() {
        
        int totalAccountType = 2;
        //pick a type at random
        int pick = rand.nextInt(totalAccountType);
        Account account = null;
        switch (pick) {
            case 0:
                account = new TransFeeAccount(rand.nextInt(100));
                break;
            case 1:
                account = new BasicFlatAccount(rand.nextInt(100));
                break;
        }
        System.out.println("Creating a random accounts: " + account.getAccountType());
        return (account);
    }

    private static final int NUM_ACCOUNTS = 5;
    public static void main(String args[]) {
        // Create some assorted accounts
        Account[] accounts = new Account[NUM_ACCOUNTS];
        // create diffrent types of accout at random
        System.out.println("\nCreating " + NUM_ACCOUNTS + " at ramdom\n");
        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = randomAccount();
        }
        System.out.println("\nSimulating transactions for the whole months (31 days\n");
        // Simulate some transactions for each account at random
        for (int day = 1; day <= 31; day++) {
            // select a created account at random
            int accountNum = rand.nextInt(accounts.length);
            Account currentAccount =  accounts[accountNum];
            // now get an integer at random from 0 to 1
            int randomNumber = rand.nextInt(100);
            // System.out.println("Random number: " + randomNumber);
            // if random number is zero we withdraaw otherwise we deposite
             //random amount to withdraw from 1 to 100
                double amount = rand.nextInt(100) + 1;
            if (randomNumber < 20) { // do something to that account          
                 System.out.println(currentAccount.getAccountType() + " Withdrawing: " + amount);
                 //invoke the supclass withdraw method
                currentAccount.withdraw(amount);
            } else {
                 System.out.println(currentAccount.getAccountType() +" Deposit: " + amount);
                  //invoke the supclass deposit method
                currentAccount.deposit(amount);
            }
        }
        // Display all accounts detaails
        System.out.println("\nEnd of month Information for the account...\n");
        for (int acct = 0; acct < accounts.length; acct++) {
            accounts[acct].endMonth(); // Polymorphism Yay!
        }
        System.out.println();
    }
}
