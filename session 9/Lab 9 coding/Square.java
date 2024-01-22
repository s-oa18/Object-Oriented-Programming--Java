public class Square extends Rectangle {

    private double width;
    private double length;

    public Square(ShapeType shapeType, Color color, int xPos, int yPos, double width, double length) {
        super(shapeType, color, xPos, yPos, width, length);
        this.length = length;
        this.width = width;
    }

    public double getWidth() {
        return this.width;
    }

    public double getLength() {
        return this.length;
    }

    @Override
    public double getPerimeter() {
        return (length * 4);
    }

    @Override
    public double getArea() {
        return (length * length);
    }

}
