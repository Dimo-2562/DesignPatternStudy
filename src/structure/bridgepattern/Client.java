package structure.bridgepattern;

import structure.bridgepattern.abstraction.AdvancedRemote;
import structure.bridgepattern.abstraction.Remote;
import structure.bridgepattern.implementation.Device;
import structure.bridgepattern.implementation.Radio;
import structure.bridgepattern.implementation.TV;

public class Client {
    public static void testDevice(Device device) {
        System.out.println("\n=== Testing with Basic Remote ===");
        Remote remote = new Remote(device);
        remote.volumeUp();
        remote.volumeDown();
    }

    public static void testAdvancedDevice(Device device) {
        System.out.println("\n=== Testing with Advanced Remote ===");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.volumeUp();
        advancedRemote.volumeUp();
        advancedRemote.mute();
        advancedRemote.volumeUp();
    }

    public static void main(String[] args) {
        System.out.println("========== Radio ==========");
        testDevice(new Radio());
        testAdvancedDevice(new Radio());

        System.out.println("\n========== TV ==========");
        testDevice(new TV());
        testAdvancedDevice(new TV());
    }
}
