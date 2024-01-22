import java.util.Scanner;

public class lab2_1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number");
        int number1 = input.nextInt();
        System.out.println("Enter the second number");
        int number2 = input.nextInt();
        if (number1 == number2) {
            System.out.println("number1 is equal to number2");
        }
        if (number1 != number2) {
            System.out.println("number1 is not equal to number2");
        }
        if (number1 < number2) {
            System.out.println("number1 is smaller than number2");
        }

        if (number1 > number2) {
            System.out.println("number1 is greater than number2");
        }

        if (number1 >= number2) {
            System.out.println("number1 is greater or equal than number2");
        }

        if (number1 <= number2) {
            System.out.println("number1 is smaller or equal than number2");
        }
        input.close();

    }
}
