public class Bobcat extends Animal{
    /**
     * A constructor that takes in a name.
     *
     * @param name Name of the animal.
     */
    public Bobcat(String name) {
        super(name);
    }

    /**
     * overwrites the sound method
     */
    public void sound() {
        System.out.println("Mreow");
    }

    /**
     * overwrites the play method
     */
    public void play() {
        System.out.println("Pounces");
    }
}
