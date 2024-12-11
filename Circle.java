package prototype.example.shapes;

/**
 * Circle é uma subclasse que implementa a clonagem de forma específica.
 */
public class Circle extends Shape {
    public int radius;

    public Circle() {}

    public Circle(Circle source) {
        super(source);
        if (source != null) {
            this.radius = source.radius;
        }
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "x=" + x +
                ", y=" + y +
                ", color='" + color + '\'' +
                ", radius=" + radius +
                '}';
    }
}
