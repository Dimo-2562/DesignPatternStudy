package behavior.visitorpattern.visitor;

import behavior.visitorpattern.element.Circle;
import behavior.visitorpattern.element.Triangle;
import behavior.visitorpattern.element.Rectangle;

public interface ShapeVisitor {
    double visit(Circle circle);
    double visit(Rectangle rectangle);
    double visit(Triangle triangle);
}
