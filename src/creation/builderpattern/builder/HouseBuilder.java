package creation.builderpattern.builder;

import creation.builderpattern.House;

public class HouseBuilder implements Builder {

    private House house;

    public HouseBuilder() {
        this.house = new House();
    }

    @Override
    public void reset() {
        this.house = new House();
    }

    @Override
    public Builder setRoofs(int roofs) {
        this.house.setRoofs(roofs);
        return this;
    }

    @Override
    public Builder setWalls(int walls) {
        this.house.setWalls(walls);
        return this;
    }

    @Override
    public Builder setWindows(int windows) {
        this.house.setWindows(windows);
        return this;
    }

    public House getResult() {
        return this.house;
    }
}
