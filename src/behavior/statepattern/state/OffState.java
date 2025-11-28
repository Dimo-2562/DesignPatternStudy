package behavior.statepattern.state;

import behavior.statepattern.LaptopContext;

public class OffState implements PowerState{

    private OffState() {}

    private static class SingletonInstanceHolder{
        private static final OffState INSTANCE = new OffState();
    }

    public static OffState getInstance(){
        return SingletonInstanceHolder.INSTANCE;
    }

    @Override
    public void pushPowerButton(LaptopContext context) {
        System.out.println("현재 상태: Laptop power OFF");
        context.changeState(OnState.getInstance());
    }
}
