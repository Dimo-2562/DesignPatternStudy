package statepattern.state;

import statepattern.LaptopContext;

public interface PowerState {
    void pushPowerButton(LaptopContext context);
}
