package statepattern;

public class Client {
    public static void main(String[] args) {
        LaptopContext laptop = new LaptopContext();

        // OFF -> ON
        laptop.pushPowerButton();
        laptop.printCurrentState();

        // ON -> SAVING
        laptop.setSavingState();
        laptop.printCurrentState();

        // SAVING -> ON
        laptop.pushPowerButton();
        laptop.printCurrentState();

        // ON -> OFF
        laptop.pushPowerButton();
        laptop.printCurrentState();

    }
}
