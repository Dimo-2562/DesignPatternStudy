package creation.builderpattern.builder;

public interface Builder {
    void reset();
    Builder setRoofs(int roofs);
    Builder setWalls(int walls);
    Builder setWindows(int windows);
}
