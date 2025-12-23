package structure.flyweightpattern;

import structure.flyweightpattern.flyweight.FontFactory;

public class Client {
    public static void main(String[] args) {
        FontFactory fontFactory = new FontFactory();
        Character c1 = new Character('h', "red", fontFactory.getFont("nanum:12"));
        Character c2 = new Character('e', "white", fontFactory.getFont("nanum:12"));
        Character c3 = new Character('l', "white", fontFactory.getFont("nanum:12"));
        Character c4 = new Character('l', "blue", fontFactory.getFont("nanum:12"));
        Character c5 = new Character('o', "white", fontFactory.getFont("nanum:12"));

        System.out.println("=== Flyweight Pattern Verification ===");
        System.out.println("c1 font == c2 font: " + (c1.getFont() == c2.getFont()));
        System.out.println("c2 font == c3 font: " + (c2.getFont() == c3.getFont()));
        System.out.println("c3 font == c4 font: " + (c3.getFont() == c4.getFont()));
        System.out.println("c4 font == c5 font: " + (c4.getFont() == c5.getFont()));

        System.out.println();
        System.out.println("All characters share the same Font object!");
        System.out.println("Font family: " + c1.getFont().getFamily());
        System.out.println("Font size: " + c1.getFont().getSize());
    }
}
