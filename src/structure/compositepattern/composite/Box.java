package structure.compositepattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Box implements Component {

    private List<Component> components;
    private String name;

    public Box(String name) {
        components = new ArrayList<>();
        this.name = name;
    }

    public void add(Component item){
        components.add(item);
    }

    public void remove(Component item){
        components.remove(item);
    }

    public List<Component> getComponents() {
        return components;
    }

    @Override
    public int getPrice() {
        int totalPrice = 0;
        for (Component component : components) {
            totalPrice += component.getPrice();
        }
        return totalPrice;
    }

    @Override
    public String getName() {
        return name;
    }
}
