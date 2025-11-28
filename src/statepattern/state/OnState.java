package statepattern.state;

import statepattern.LaptopContext;

public class OnState implements PowerState{
    @Override
    public void pushPowerButton(LaptopContext context) {
        System.out.println("현재 상태: Laptop power ON");
        context.changeState(new OffState());
    }
}
