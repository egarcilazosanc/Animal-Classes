/**
 * The {@code Cougar} class represents a cougar, a large wild cat known for its
 * powerful capabilities as a predator. This class extends {@code Animal}, inheriting
 * its characteristics and behaviors while providing specific implementations for how
 * a cougar makes a sound and plays.
 *
 * <p>This class specifically overrides the sound and play methods to demonstrate
 * behaviors typical of a cougar, such as roaring and pouncing.</p>
 *
 * @author Daniel Tongu
 * 4/12/2024
 */
public class Cougar extends Animal {

    /**
     * A constructor that takes in a name.
     *
     * @param name Name of the cougar.
     */
    public Cougar(String name) {
        super(name);
    }

    /**
     * Outputs the sound typical of a cougar. This method overrides the sound
     * method in the {@code Animal} class and provides a specific implementation
     * for the cougar, which is characterized by a loud roar.
     */
    @Override
    public void sound() {
        System.out.println(this.name + " sounds: RRRAAAWR...");
    }

    /**
     * Simulates a playful behavior typical of cougars. This method overrides
     * the play method in the {@code Animal} class and demonstrates a common
     * playful action for cougars, which is pouncing. This can be part of their
     * hunting practice or playful activity with other cougars.
     */
    @Override
    public void play() {
        System.out.println(this.name + " plays; pounce, pounce,...");
    }

    /**
     * Outputs the eating behavior of a cougar. This method overrides the eat
     * method in the {@code Animal} class and provides a specific implementation
     * indicating what the cougar is eating, using the cougar's name for a personalized touch.
     */
    @Override
    public void eat() {
        System.out.println(this.name + " eats some meat.");
    }
}
