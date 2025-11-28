package statepattern.state;

import statepattern.LaptopContext;

public class OffState implements PowerState{
    @Override
    public void pushPowerButton(LaptopContext context) {
        System.out.println("현재 상태: Laptop power OFF");
        context.changeState(new OnState());
    }
}
