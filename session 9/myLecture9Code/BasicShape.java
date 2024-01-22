public abstract class BasicShape {

    private Color colour;

    public BasicShape(Color colour) {
        this.colour = colour;
    }

    public Color getColor() {
        return colour;
    }

    public abstract String getDetails();

    public String toString() {
        return getDetails();
    }

}
