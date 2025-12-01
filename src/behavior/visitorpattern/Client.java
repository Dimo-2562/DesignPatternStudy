package behavior.visitorpattern;

import behavior.visitorpattern.element.Circle;
import behavior.visitorpattern.element.Rectangle;
import behavior.visitorpattern.element.Shape;
import behavior.visitorpattern.element.Triangle;
import behavior.visitorpattern.visitor.AreaCalculator;
import behavior.visitorpattern.visitor.ShapeVisitor;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(10));
        shapes.add(new Triangle(2, 4, 5));
        shapes.add(new Rectangle(3, 5));

        double totalArea = 0.0;
        ShapeVisitor visitor = new AreaCalculator();

        for (Shape shape : shapes) {
            totalArea += shape.accept(visitor);
        }

        System.out.println("Total area: " + totalArea);
    }
}
