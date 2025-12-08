package creation.builderpattern;

import creation.builderpattern.builder.Builder;

public class Director {
    public void makeSimpleHouse(Builder builder) {
        builder.reset();
        builder.setRoofs(1);
    }

    public void makeComplexHouse(Builder builder) {
        builder.reset();
        builder.setRoofs(4)
                .setWalls(4)
                .setWindows(2);
    }
}
