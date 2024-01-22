public abstract class Shape3D extends BasicShape {

    private int xPos;
    private int yPos;
    private int zPos;

    public Shape3D(ShapeType shapeType, Color color, int xPos, int yPos, int zPos) {
        super(shapeType, color);
        this.xPos = xPos;
        this.yPos = yPos;
        this.zPos = zPos;
    }

    public int getXPos() {
        return this.xPos;
    }

    public int getYPos() {
        return this.yPos;
    }

    public int getZPos() {
        return this.zPos;
    }

    public abstract double getVolume();

    public String getDetails() {
        String st = "";
        st += "\nColor: " + this.getColor();
        st += "\nShape Type: " + this.getShapeType();
        st += "\nX position: " + this.getXPos();
        st += "\nY position: " + this.getYPos();
        st += "\nY position: " + this.getZPos();
        st += "\nVolume: " + String.format("%.2f", this.getVolume());
        return st;
    }
}
