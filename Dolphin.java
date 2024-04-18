public class Dolphin extends Animal{
    /**
     * A constructor that takes in a name.
     *
     * @param name Name of the animal.
     */
    public Dolphin(String name) {
        super(name);
    }

    /**
     * Prints the noise a dolphin makes
     */
    @Override
    public void sound() {
        System.out.println("Ee ee ee");
    }

    /**
     * Prints what a dolphin does for fun
     */
    @Override
    public void play() {
        System.out.println("Dolphin hits a beach ball");
    }
}
