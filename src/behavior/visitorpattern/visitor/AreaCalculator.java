package behavior.visitorpattern.visitor;

import behavior.visitorpattern.element.Circle;
import behavior.visitorpattern.element.Triangle;
import behavior.visitorpattern.element.Rectangle;

public class AreaCalculator implements ShapeVisitor {
    @Override
    public double visit(Circle circle) {
        return Math.PI * Math.pow(circle.getRadius(), 2);
    }

    @Override
    public double visit(Rectangle rectangle) {
        return rectangle.getWidth() * rectangle.getHeight();
    }

    @Override
    public double visit(Triangle triangle) {
        double s = (triangle.getSideA() + triangle.getSideB() + triangle.getSideC()) / 2;
        return Math.sqrt(s * (s - triangle.getSideA()) * (s - triangle.getSideB()) * (s - triangle.getSideC()));
    }
}
