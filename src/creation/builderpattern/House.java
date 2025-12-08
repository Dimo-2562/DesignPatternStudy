package creation.builderpattern;

public class House {
    private int roofs;
    private int walls;
    private int windows;

    public int getRoofs() {
        return roofs;
    }

    public void setRoofs(int roofs) {
        this.roofs = roofs;
    }

    public int getWalls() {
        return walls;
    }

    public void setWalls(int walls) {
        this.walls = walls;
    }

    public int getWindows() {
        return windows;
    }

    public void setWindows(int windows) {
        this.windows = windows;
    }

    @Override
    public String toString() {
        return "House{" +
                "roofs=" + roofs +
                ", walls=" + walls +
                ", windows=" + windows +
                '}';
    }
}
