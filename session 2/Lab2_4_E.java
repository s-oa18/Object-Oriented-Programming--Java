import java.util.Scanner;

public class Lab2_4_E {

    public static void main(String[] a){

        Scanner input = new Scanner(System.in);
        System.out.println("\nEnter the initial amount in the account");
        double principle = input.nextDouble();
        System.out.println("Enter the interest rate  (i.e.as 0.05 )");
        double rate = input.nextDouble();
        System.out.println("Enter the number of years");
        int years = input.nextInt();
        System.out.printf("\nPrinciple: %.2f \tRate: %.2f \tNumber years: %d", principle, rate, years);
        System.out.println("\nYear \tAmount");
        for (int year = 1; year <= years; year++){
            double amount = principle * Math.pow(1.0 + rate, year);
            System.out.printf("%d \t%.2f\n", year, amount);
        }
        System.out.println("\n");
        input.close();
}    
    
}
