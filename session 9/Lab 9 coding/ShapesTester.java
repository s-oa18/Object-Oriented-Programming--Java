import java.util.ArrayList;

public class ShapesTester {

    public static void main(String[] args) {
        BasicShape s1 = new Circle(ShapeType.CIRCLE, Color.BLUE, 10, 10, 27.5);
        BasicShape s2 = new Rectangle(ShapeType.RECTANGLE, Color.BLUE, 20, 20, 20, 50);
        BasicShape s3 = new Sphere(ShapeType.SPHERE, Color.BLUE, 30, 30, 30, 50);
        BasicShape s4 = new Square(ShapeType.SQUARE, Color.BLUE, 20, 20, 20, 20);
        BasicShape s5 = new Triangle(ShapeType.TRIANGLE, Color.ORANGE, 20, 30, 50, 30, 10);
        BasicShape s6 = new Cuboid(ShapeType.CUBOID, Color.ORANGE, 20, 30, 50, 30, 10, 20);
        BasicShape s7 = new Cube(ShapeType.CUBE, Color.ORANGE, 20, 30, 50, 30, 10);

        ArrayList<BasicShape> shapes = new ArrayList<>();
        shapes.add(s1);
        shapes.add(s2);
        shapes.add(s3);
        shapes.add(s4);
        shapes.add(s5);
        shapes.add(s6);
        shapes.add(s7);
        for (BasicShape shape : shapes) {
            System.out.println(shape);
        }
    }
}
