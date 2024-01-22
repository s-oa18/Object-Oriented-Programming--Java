public abstract class Shape2D extends BasicShape {

    private int xPos;
    private int yPos;

    public Shape2D(ShapeType shapeType, Color color, int xPos, int yPos) {
        super(shapeType, color);
        this.xPos = xPos;
        this.yPos = yPos;
    }

    public int getXPos() {
        return this.xPos;
    }

    public int getYPos() {
        return this.yPos;
    }

    public abstract double getPerimeter();

    public abstract double getArea();

    public String getDetails() {
        String st = "";
        st += "\nShape Type: " + this.getShapeType();
        st += "\nColor: " + this.getColor();
        st += "\nX position: " + this.getXPos();
        st += "\nY position: " + this.getYPos();
        st += "\nPerimeter: " + String.format("%.2f", this.getPerimeter());
        st += "\nArea: " + String.format("%.2f", this.getArea());
        return st;
    }
}
