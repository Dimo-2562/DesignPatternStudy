package creation.builderpattern;

public class House {
    private final int roofs;
    private final int walls;
    private final int windows;

    private House(Builder builder) {
        this.roofs = builder.roofs;
        this.walls = builder.walls;
        this.windows = builder.windows;
    }

    public int getRoofs() {
        return roofs;
    }

    public int getWalls() {
        return walls;
    }

    public int getWindows() {
        return windows;
    }

    @Override
    public String toString() {
        return "House{" +
                "roofs=" + roofs +
                ", walls=" + walls +
                ", windows=" + windows +
                '}';
    }

    public static class Builder {
        private int roofs;
        private int walls;
        private int windows;

        public Builder setRoofs(int roofs) {
            this.roofs = roofs;
            return this;
        }

        public Builder setWalls(int walls) {
            this.walls = walls;
            return this;
        }

        public Builder setWindows(int windows) {
            this.windows = windows;
            return this;
        }

        public House build() {
            return new House(this);
        }
    }
}
