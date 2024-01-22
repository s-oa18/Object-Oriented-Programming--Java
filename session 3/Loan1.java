public class Loan1 {

    public static double getLoanCostNoPayment(double loanAmount, double yearlyIncreaseRatio, int year) {
        return loanAmount * Math.pow(yearlyIncreaseRatio, year);
    }

    public static void main(String[] args) {
        // Data input
        double yearlyInterestRate = 8; // %
        double loanAmount = 100000;
        int years = 25;
        // calculations
        double yearlyIncreaseRatio = 1 + (yearlyInterestRate / 100);
        double montlyPaymentAmount = getLoanCostNoPayment(loanAmount, yearlyIncreaseRatio, years) 
                / (((Math.pow(yearlyIncreaseRatio, years) - 1) / (yearlyIncreaseRatio - 1)) / 12);
        // display information
        System.out.printf("\nRatio: %.2f Monthly Payment: %.2f\n\n", yearlyIncreaseRatio,
                montlyPaymentAmount);
    }
}

/*
  int year = 5;
 * 
 * // double loanCostNoPayment(year)= loanAmount * yearlyIncreaseRatio ^year
 * 
 * // deductions (year) = ((12*monthlyPayment*
 * (yearlyIncreaseRatio^year-1)))/((yearlyIncreaseRatio-1) )
 * 
 * // amountOwed(year) = loanCostNoPayment- deductions
 */

/*
 * public static void main(String[] args) {
 * //Data input
 * double yearlyInterestRate = 8; // %
 * double loanAmount = 100000;
 * int years = 25;
 * //variables needed
 * double yearlyIncreaseRatio;
 * double montlyPaymentAmount;
 * int year = 5;
 * //calculations
 * yearlyIncreaseRatio = getYearlyIncreaseRatio(yearlyInterestRate);
 * montlyPaymentAmount = getMontlyPaymentAmount(loanAmount, yearlyIncreaseRatio,
 * years);
 * //display information
 * System.out.printf("\nRatio: %.2f Monthly Payment: %.2f\n\n",
 * yearlyIncreaseRatio,
 * montlyPaymentAmount);
 * }
 */


 /*
  *     public static double getMontlyPaymentAmount(double loanAmount, double yearlyIncreaseRatio, int years) {
        double yearlyPaymentAmount = getLoanCostNoPayment(loanAmount, yearlyIncreaseRatio, years)
                / (((Math.pow(yearlyIncreaseRatio, years) - 1) / (yearlyIncreaseRatio - 1)));
        return yearlyPaymentAmount / 12;

        public static double getYearlyIncreaseRatio(double yearlyInterestRate) {
        return 1 + (yearlyInterestRate / 100);
    }
  */