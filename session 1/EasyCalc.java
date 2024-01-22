import java.util.Scanner;

public class EasyCalc {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double x, y, z, result;
        System.out.println("Enter value for X");
        x = input.nextDouble();
        System.out.println("Enter value for Y");
        y = input.nextDouble();
        System.out.println("Enter value for Z");
        z = input.nextDouble();
        result = x * y * z;

        System.out.printf("Result is: %.3f\n", result);
        input.close();

    }

}
