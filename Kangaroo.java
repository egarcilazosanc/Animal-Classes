public class Kangaroo extends Animal {
    /**
     * A constructor that takes in a name for the Kangaroo
     *
     * @param name Name of the animal.
     */
    public Kangaroo(String name) {
        super(name);
    }

    /**
     * Prints a sound that a Kangaroo would make
     */
    @Override
    public void sound() {
        System.out.println("*cough*");
    }

    /**
     * Prints out to the console what the Kangaroo would do for fun.
     */
    @Override
    public void play() {
        System.out.println(name + " lazes about");
    }
}
