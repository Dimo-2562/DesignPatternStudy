package structure.bridgepattern.abstraction;

import structure.bridgepattern.implementation.Device;

public class AdvancedRemote extends Remote {
    public AdvancedRemote(Device device) {
        super(device);
    }

    public void mute() {
        device.setVolume(0);
        System.out.println("Muted, volume = " + device.getVolume());
    }
}
