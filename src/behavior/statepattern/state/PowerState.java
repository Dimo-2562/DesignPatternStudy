package behavior.statepattern.state;

import behavior.statepattern.LaptopContext;

public interface PowerState {
    void pushPowerButton(LaptopContext context);
}
