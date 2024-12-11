package prototype.example;

import prototype.example.shapes.Circle;
import prototype.example.shapes.Rectangle;
import prototype.example.shapes.Shape;

import java.util.ArrayList;
import java.util.List;

/**
 * Código cliente que utiliza o padrão Prototype.
 */
public class Demo {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        List<Shape> shapesCopy = new ArrayList<>();

        // Criando e configurando formas geométricas
        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 20;
        circle.radius = 15;
        circle.color = "Red";
        shapes.add(circle);

        Rectangle rectangle = new Rectangle();
        rectangle.x = 30;
        rectangle.y = 40;
        rectangle.width = 50;
        rectangle.height = 25;
        rectangle.color = "Blue";
        shapes.add(rectangle);

        // Clonando as formas
        for (Shape shape : shapes) {
            shapesCopy.add(shape.clone());
        }

        // Exibindo as formas originais e suas cópias
        for (int i = 0; i < shapes.size(); i++) {
            System.out.println("Original: " + shapes.get(i));
            System.out.println("Cópia: " + shapesCopy.get(i));
            System.out.println();
        }
    }
}
