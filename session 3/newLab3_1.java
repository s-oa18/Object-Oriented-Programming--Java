import java.util.Random;

public class newLab3_1 {

    public static double getArea(double radius) {
        return (Math.PI * radius * radius);
    }

    public static void main(String[] args) {

        Random randrad = new Random();
        double radius = randrad.nextDouble(5) + 10;

        System.out.printf("\nArea of radius: %.2f is %.2f\n\n", radius, getArea(radius));

    }

}
