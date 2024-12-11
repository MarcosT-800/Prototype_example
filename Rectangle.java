package prototype.example.shapes;

/**
 * Rectangle é outra subclasse que implementa a clonagem.
 */
public class Rectangle extends Shape {
    public int width;
    public int height;

    public Rectangle() {}

    public Rectangle(Rectangle source) {
        super(source);
        if (source != null) {
            this.width = source.width;
            this.height = source.height;
        }
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "x=" + x +
                ", y=" + y +
                ", color='" + color + '\'' +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}
