package behavior.statepattern;

import behavior.statepattern.state.OffState;
import behavior.statepattern.state.PowerState;
import behavior.statepattern.state.SavingState;

public class LaptopContext {
    private PowerState powerState;

    public LaptopContext() {
        this.powerState = OffState.getInstance();
    }

    public void changeState(PowerState newState) {
        this.powerState = newState;
    }

    public void setSavingState() {
        System.out.println("현재 상태: Laptop power ON");
        this.changeState(SavingState.getInstance());
    }

    public void pushPowerButton(){
        this.powerState.pushPowerButton(this);
    }

    public void printCurrentState(){
        System.out.println("변경 상태: " + this.powerState.getClass().getName());
    }

}
