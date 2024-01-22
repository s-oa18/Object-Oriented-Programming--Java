public class Circle extends Shape2D {

    private double radius;

    public Circle(Color colour, double xPos, double yPos, double radius) {
        super(colour, xPos, yPos);
        this.radius = radius;

    }

    public double getradius(){
        return this.radius;
    }

    @Override
    public double getPerimeter()
    
}
