package behavior.statepattern.state;

import behavior.statepattern.LaptopContext;

public class OnState implements PowerState{

    private OnState() {}

    private static class SingletonInstanceHolder{
        private static final OnState INSTANCE = new OnState();
    }

    public static OnState getInstance(){
        return OnState.SingletonInstanceHolder.INSTANCE;
    }

    @Override
    public void pushPowerButton(LaptopContext context) {
        System.out.println("현재 상태: Laptop power ON");
        context.changeState(OffState.getInstance());
    }
}
