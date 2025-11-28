package behavior.statepattern.state;

import behavior.statepattern.LaptopContext;

public class SavingState implements PowerState{

    private SavingState() {}

    private static class SingletonInstanceHolder{
        private static final SavingState INSTANCE = new SavingState();
    }

    public static SavingState getInstance(){
        return SavingState.SingletonInstanceHolder.INSTANCE;
    }

    @Override
    public void pushPowerButton(LaptopContext context) {
        System.out.println("현재 상태: Laptop power Saving");
        context.changeState(OnState.getInstance());
    }
}
