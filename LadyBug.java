/**
 *Class that extends Animal
 *@author Mohammed Mohideen
 */

public class LadyBug extends Animal {

    /**
     * Constructor that initializes a name
     *
     * @param name The name of the ladybug
     */
    public LadyBug(String name) {
        super(name);
    }

    /**
     * Prints the sound of the ladybug
     */
    @Override
    public void sound() {
        System.out.println("bzz");
    }

    /**
     * Prints the ladybug playing
     */
    @Override
    public void play() {
        System.out.println("Flies around");

    }

    /**
     * Prints the ladybug eating
     */
    @Override
    public void eat() {
        System.out.println("eats leaves");
    }
}
