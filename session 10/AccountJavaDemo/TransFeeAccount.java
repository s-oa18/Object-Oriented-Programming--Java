
// An Acccount subclass where there is a 0.5 charge per withdrawal.

public class TransFeeAccount extends Account {

   public final double WITHDRAW_CHARGE = 0.50;

   private int withdrawCount;

   public TransFeeAccount(double balance) {
      super(balance);
      withdrawCount = 0;
   }

   public void withdraw(double amount) {
      super.withdraw(amount);
      // withdraw done. Increase the count
      withdrawCount++;
   }

   // each month, the number of withdraw transactions
   // is multiplied by the charge and returned.
   // At the end of each month the withdraw cout is reset to 0
   public void ProcessEndMonthCharge() {
      withdraw(withdrawCount * WITHDRAW_CHARGE);
      withdrawCount = 0;
   }
}