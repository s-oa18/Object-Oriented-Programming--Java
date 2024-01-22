import java.util.Scanner;

public class Lab2_2_2 {
    public static void main(String[] a) {
        Scanner input = new Scanner(System.in);
        int passes = 0, failures = 0, numberEntries = 0;
        boolean continueInput = true;
        while (continueInput) {
            System.out.println("Enter result (1 = Pass, 2 = fail, Other value to Exit)");
            int result = input.nextInt();
            if (result == 1) {
                passes++;
                numberEntries++;
            } else if (result == 2) {
                failures++;
                numberEntries++;
            } else {
                System.out.println("Data Entry finished, Program Ending");
                continueInput = false;
            }
        }
        System.out.printf("\nPasses: %d Fails %d\n", passes, failures);
        double halfEntries = numberEntries / 2.0;
        if (passes >= halfEntries) {
            System.out.println("Bonus to instructor: Half of the students passed");
        }
        input.close();
    }
}
