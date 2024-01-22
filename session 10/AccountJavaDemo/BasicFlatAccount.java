
// An Account where there is a flat charge of 5 fee per month.

public class BasicFlatAccount extends Account {

    public final double CHARGE = 5.00;

    public BasicFlatAccount(double balance) {
        super(balance);
    }

    public void ProcessEndMonthCharge() {
        withdraw(CHARGE);
    }

}