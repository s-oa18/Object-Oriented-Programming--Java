public class Investment1 {

    public static double calculateRateIncrease(double yearlyInterestRate) {
        return 1 + (yearlyInterestRate / 12 / 100);
    }

    public static double computeNewCapital(double principle, double rateIncrease, int year) {
        return principle * rateIncrease * ((Math.pow(rateIncrease, year) - 1) / (rateIncrease - 1));
    }

    public static void displayGains(double principle, double rateIncrease, int years) {
        for (int i = 1; i <= years; i++) {
            double value = computeNewCapital(principle, rateIncrease, i);
            System.out.printf("Year: %d Capital: %.3f Capital Gain: %.3f\n", i, value, value - principle);
        }

    }

    public static void main(String[] a) {

        double principle = 100;
        double yearlyInterestRate = 4.5;
        int year = 10;
        double rateIncreaseRatio = calculateRateIncrease(yearlyInterestRate);
        double wantedPrinciple = 3000;

        // System.out.println(rateIncrease);

        //double newCapital = principle*rateIncrease*((Math.pow(rateIncrease,year)-1)/(rateIncrease-1));
        double newCapital2 = computeNewCapital(principle,rateIncreaseRatio, year);
        System.out.printf("\nInitial amount: %.2f New Principle: %.2f Capital Gain: %.2f after %d years\n\n",principle, newCapital2, newCapital2-principle, year);

        // for (int i = 0; i <= 10; i++) {

        //     System.out.printf("%.3f\n", computeNewCapital(principle, rateIncrease, i));
        // }
           // displayGains(principle, rateIncrease,5);
           System.out.println(Math.log10(22));

           double months = Math.log10(wantedPrinciple/((principle * rateIncreaseRatio)/(rateIncreaseRatio-1))+1)/Math.log10(rateIncreaseRatio);
         
           int monthsNeeded = (int)Math.ceil(months);

           System.out.printf("\nMonths needed to accumulate £%.2f at a rate of %.2f%% is %2d months given an initial investment of £%.2f\n\n", 
           wantedPrinciple, yearlyInterestRate, monthsNeeded, principle);

  

           

    }

}
