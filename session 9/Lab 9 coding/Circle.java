public class Circle extends Shape2D {
    private double radius;

    public Circle(ShapeType shapeType, Color color, int xPos, int yPos, double radius) {
        super(shapeType, color, xPos, yPos);
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    @Override
    public double getPerimeter() {
        // P= 2 * π * r
        return 2 * Math.PI * this.radius;
    }

    @Override
    public double getArea() {
        // A = π * r ^ 2
        return Math.PI * this.radius * this.radius;
    }
}
