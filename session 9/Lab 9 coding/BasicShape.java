public abstract class BasicShape {
    private Color color;
    private ShapeType shapeType;

    public BasicShape(ShapeType shapeType, Color color) {
        this.color = color;
        this.shapeType = shapeType;
    }

    public ShapeType getShapeType() {
        return this.shapeType;
    }

    public Color getColor() {
        return this.color;
    }

    public abstract String getDetails();

    public String toString() {
        return getDetails();
    }
}
