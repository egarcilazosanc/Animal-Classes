public class Duck extends Animal {
    /**
     * A constructor that takes in a name.
     *
     * @param name Name of the animal.
     */
    public Duck(String name) {
        super(name);
    }

    /**
     * makes a sound that a duck would make
     */
    @Override
    public void sound() {
        System.out.println("Quack!");
    }

    /**
     * prints out to the console what the duck would do for fun.
     */
    @Override
    public void play() {
        System.out.println(name + " swims around a nearby pond");
    }
}
