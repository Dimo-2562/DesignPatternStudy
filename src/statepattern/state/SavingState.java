package statepattern.state;

import statepattern.LaptopContext;

public class SavingState implements PowerState{
    @Override
    public void pushPowerButton(LaptopContext context) {
        System.out.println("현재 상태: Laptop power Saving");
        context.changeState(new OnState());
    }
}
