package structure.bridgepattern.implementation;

public class Radio implements Device{
    private int volume = 30;

    @Override
    public void setVolume(int percent) {
        if (percent > 100) {
            this.volume = 100;
        } else if (percent < 0) {
            this.volume = 0;
        } else {
            this.volume = percent;
        }
        System.out.println("[Radio] Volume adjusted to " + this.volume);
    }

    @Override
    public int getVolume() {
        return this.volume;
    }
}
