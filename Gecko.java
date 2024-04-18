/**
 * Represents a Gecko, a subclass of Animal.
 */
public class Gecko extends Animal {
    /**
     * Constructs a Gecko object with the given name.
     *
     * @param name The name of the Gecko.
     */
    public Gecko(String name) {
        super(name);
    }

    /**
     * Makes a sound specific to a Gecko.
     */
    @Override
    public void sound() {
        System.out.println("I'm a gecko, not a geico! But here's my catchphrase: '15 minutes could save you 15% or more on car insurance.'");
    }

    /**
     * Simulates a play activity for the Gecko.
     */
    @Override
    public void play() {
        System.out.println("I'm playing hide and seek, but you won't find me as easily as saving money with GEICO.");
    }

    /**
     * Describes the eating behavior of the Gecko.
     */
    @Override
    public void eat() {
        System.out.println("I'm eating bugs, just like GEICO helps to eat away at high insurance rates.");
    }
}