public class Loan1_v2 {
    public static double getLoanCostNoPayment(double loanAmount, double yearlyIncreaseRatio, int year) {
        return loanAmount * Math.pow(yearlyIncreaseRatio, year);
    }
    public static double getMontlyPaymentAmount(double loanAmount, double yearlyIncreaseRatio, int years) {
        double yearlyPaymentAmount = getLoanCostNoPayment(loanAmount, yearlyIncreaseRatio, years)
                / (((Math.pow(yearlyIncreaseRatio, years) - 1) / (yearlyIncreaseRatio - 1)));
        return yearlyPaymentAmount / 12;
    }
    public static double getYearlyIncreaseRatio(double yearlyInterestRate) {
        return 1 + (yearlyInterestRate / 100);
    }
    public static double getDeductionsRatio(double yearlyIncreaseRatio, int year){
        return 12 * ((Math.pow(yearlyIncreaseRatio, year) - 1) / (yearlyIncreaseRatio - 1));
    }
    public static void main(String[] args) {
        // Data input
        double yearlyInterestRate = 8; // %
        double loanAmount = 100000;
        int years = 25;
        // calculations
        double yearlyIncreaseRatio = getYearlyIncreaseRatio(yearlyInterestRate);
        double montlyPaymentAmount = getMontlyPaymentAmount(loanAmount, yearlyIncreaseRatio, years);
        double paymentMade = 0;
        //getting yearly payment listing
        for (int year = 1; year <= 25; year++) {
            paymentMade += montlyPaymentAmount * 12;
            double loanCostNoPayment = getLoanCostNoPayment(loanAmount, yearlyIncreaseRatio, year);
            double deductionsRatio = getDeductionsRatio(yearlyIncreaseRatio, year);
            double amountOwed = loanCostNoPayment - (deductionsRatio * montlyPaymentAmount);
            System.out.printf("Year: %d Ratio: %.2f Monthly Payment: %.2f Amount Owed %.2f payment cuml: %.2f\n", 
            year, yearlyIncreaseRatio,  montlyPaymentAmount, amountOwed, paymentMade);
        }
    }
}



/*
 * // double loanCostNoPayment = getLoanCostNoPayment(loanAmount, yearlyIncreaseRatio, 10);

        // double deductions = 12 * ((Math.pow(yearlyIncreaseRatio, 10) - 1) / (yearlyIncreaseRatio - 1));

        // double amountOwed = loanCostNoPayment - (deductions * montlyPaymentAmount);

        // display information
        // System.out.printf("\nRatio: %.2f Monthly Payment: %.2f Amount Owed %.2f\n\n", yearlyIncreaseRatio,
        //         montlyPaymentAmount, amountOwed);


          double deductionsRatio = 12 * ((Math.pow(yearlyIncreaseRatio, year) - 1) / (yearlyIncreaseRatio - 1));
 */