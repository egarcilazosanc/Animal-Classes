/**
 * An iguana animal class
 */
public class Iguana extends Animal {
    /**
     * The name of the iguana.
     */
    String name;

    /**
     * Initializes a new iguana
     * @param name The name of the iguana
     */
    public Iguana(String name) {
        super(name);
    }

    /**
     * Prints out the sound an iguana makes.
     */
    public void sound() {
        System.out.println("Zzzzzzzz");
    }

    /**
     * Prints to the console a description of how an iguana plays
     */
    public void play() {
        System.out.println("Iguanas like to lounge in the sun and swing on curtains!");
    }
}
