public class Sphere extends Shape3D {

    private double radius;

    public Sphere(ShapeType shapeType, Color color, int xPos, int yPos, int zPos, double radius) {
        super(shapeType, color, xPos, yPos, zPos);
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    @Override
    public double getVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
}
