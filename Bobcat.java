public class Bobcat extends Animal{
    /**
     * A constructor that takes in a name.
     *
     * @param name Name of the animal.
     */
    public Bobcat(String name) {
        super(name);
    }

    public void sound() {
        System.out.println("Mreow");
    }

    public void play() {
        System.out.println("Pounces");
    }
}
