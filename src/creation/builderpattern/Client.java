package creation.builderpattern;

import creation.builderpattern.builder.Builder;
import creation.builderpattern.builder.HouseBuilder;

public class Client {
    public static void main(String[] args) {
        Director director = new Director();
        HouseBuilder builder = new HouseBuilder();

        System.out.println("=== Simple House ===");
        director.makeSimpleHouse(builder);
        House simpleResult = builder.getResult();
        System.out.println(simpleResult);

        System.out.println("\n=== Complex House ===");
        director.makeComplexHouse(builder);
        House complexResult = builder.getResult();
        System.out.println(complexResult);

        System.out.println("\n=== Custom House (without Director) ===");
        builder.reset();
        builder.setRoofs(3)
                .setWalls(6)
                .setWindows(10);
        House customHouse = builder.getResult();
        System.out.println(customHouse);
    }
}
