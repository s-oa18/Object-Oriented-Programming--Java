public abstract class Shape2D extends BasicShape {

    private double xPos, yPos;

    public Shape2D(Color colour, double xPos, double yPos) {
        super(colour);
        this.xPos = xPos;
        this.yPos = yPos;

    }

    public double getXPos() {
        return this.xPos;
    }

    public double getYPos() {
        return this.yPos;
    }

    public abstract double getPerimeter();

    public abstract double getArea();

    @Override
    public String getDetails() {
        String st = "";
        st += "Colour = " + getColor();
        st += "Xpos = " + xPos + "YPos = " + yPos;
        st += "\n Perimeter = " + getPerimeter();
        st += "\n Area = " + getArea();
        return st;

    }
}
