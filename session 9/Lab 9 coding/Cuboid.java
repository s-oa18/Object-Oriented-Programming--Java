public class Cuboid extends Shape3D {
    private double width;
    private double length;
    private double height;

    public Cuboid(ShapeType shapeType, Color color, int xPos, int zPos, int yPos, double width, double length,
            double height) {
        super(shapeType, color, xPos, yPos, zPos);
        this.width = width;
        this.length = length;
        this.height = height;

    }

    public double getWidth() {
        return this.width;
    }

    public double getLength() {
        return this.length;
    }

    public double getHeight() {
        return this.height;
    }

    @Override
    public double getVolume() {
        return (this.length * this.width * this.height);
    }

}
