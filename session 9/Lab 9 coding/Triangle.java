public class Triangle extends Shape2D {
    private double sideA;
    private double sideB;
    private double angle;

    public Triangle(ShapeType shapeType, Color color, int xPos, int yPos, double sideA, double sideB, double angle) {
        super(shapeType, color, xPos, yPos);
        this.sideA = sideA;
        this.sideB = sideB;
        this.angle = angle;

    }

    public double getSideA() {
        return this.sideA;
    }

    public double getSideB() {
        return this.sideB;
    }

    public double getAngle() {
        return this.angle;
    }

    public double getSide3() {
        // c^2 = a^2 + b^2 - (2abcos(angle))
        double side3 = (sideA * sideA) + (sideB * sideB) - (2 * sideA * sideB * Math.cos(angle));
        return side3;
    }

    @Override
    public double getPerimeter() {
        // P = a + b + c;
        return (sideA + sideB + getSide3());
    }

    @Override
    public double getArea() {
        // A = 1/2 * ab * sin(angle)
        return (1 / 2) * (sideA * sideB) * Math.sin(angle);
    }

}
