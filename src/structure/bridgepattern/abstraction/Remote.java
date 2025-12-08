package structure.bridgepattern.abstraction;

import structure.bridgepattern.implementation.Device;

public class Remote {
    protected Device device;

    public Remote(Device device) {
        this.device = device;
    }

    public void volumeDown() {
        int current = device.getVolume();
        device.setVolume(current - 10);
        System.out.println("volume down, volume = " + device.getVolume());
    }

    public void volumeUp() {
        int current = device.getVolume();
        device.setVolume(current + 10);
        System.out.println("volume up, volume = " + device.getVolume());
    }
}
