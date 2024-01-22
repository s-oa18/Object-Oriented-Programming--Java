public class Lab2_4 {

    public static void main(String[] a){
        double principle = 500.0;
        final double rate = 0.05;
        int years = 5;
        System.out.printf("\nPrinciple: %.2f \tRate: %.2f \tNumber years: %d", principle, rate, years);
        System.out.println("\nYear \tAmount");
        for (int year = 1; year <= years; year++){
            double amount = principle * Math.pow(1.0 + rate, year);
            System.out.printf("%d \t%.2f\n", year, amount);
        }
        System.out.println("\n");
}    
}
