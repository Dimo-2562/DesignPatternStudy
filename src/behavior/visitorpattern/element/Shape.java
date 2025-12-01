package behavior.visitorpattern.element;

import behavior.visitorpattern.visitor.ShapeVisitor;

public interface Shape {
    double accept(ShapeVisitor visitor);
}
