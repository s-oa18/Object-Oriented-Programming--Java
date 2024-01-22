import java.util.Random;

public class Lab3_1 {

    public static double getArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] a) {

        Random rand = new Random();
        double radius = rand.nextDouble(5, 10);

        System.out.printf("\nArea for radius %.2f is %.2f\n\n", radius, getArea(radius));

    }

}
