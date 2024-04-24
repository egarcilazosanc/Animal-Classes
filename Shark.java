public class Shark extends Animal {
    /**
     * A constructor that takes in a name.
     *
     * @param name Name of the animal.
     */
    public Shark(String name) {
        super(name);
    }
    
    /**
     * Method to print out the sound that the shark makes
     */
    @Override
    public void sound() {

        System.out.println(name + "\sbarks loudly!");

    }

    /**
     * Method to print out what the shark does when it plays
     */
    @Override
    public void play() {

        System.out.println(name + "\svigorously swims in circles!");

    }
}
