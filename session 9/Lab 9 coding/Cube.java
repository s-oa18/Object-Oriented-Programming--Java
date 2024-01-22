public class Cube extends Shape3D {
    private double side;

    public Cube(ShapeType shapeType, Color color, int yPos, double width, double length, double height, double side) {
        super(shapeType, color, yPos, yPos, yPos);
        this.side = side;
    }

    public double getSide() {
        return this.side;
    }

    @Override
    public double getVolume() {
        return (Math.pow(side, 3));
    }

}
