public class Eagle extends Animal{
    /**
     * A constructor that takes in a name.
     *
     * @param name Name of the animal.
     */
    public Eagle(String name) {
        super(name);
    }

    /**
     * Prints out the sound an Eagle makes.
     */
    @Override
    public void sound() {
        System.out.println("EEEERRRRRAHHH!");
    } // Method sound

    /**
     * Prints out the way an Eagle plays.
     */
    @Override
    public void play() {
        System.out.println("A Eagle plays by clawing at an object to destroy it.");
    }
}
