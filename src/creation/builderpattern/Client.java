package creation.builderpattern;

public class Client {
    public static void main(String[] args) {
        System.out.println("=== Simple House ===");
        House simpleHouse = new House.Builder()
                .setRoofs(1)
                .build();
        System.out.println(simpleHouse);

        System.out.println("\n=== Complex House ===");
        House complexHouse = new House.Builder()
                .setRoofs(4)
                .setWalls(4)
                .setWindows(2)
                .build();
        System.out.println(complexHouse);

        System.out.println("\n=== Custom House ===");
        House customHouse = new House.Builder()
                .setRoofs(3)
                .setWalls(6)
                .setWindows(10)
                .build();
        System.out.println(customHouse);
    }
}
