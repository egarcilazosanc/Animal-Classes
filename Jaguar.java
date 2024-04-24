/*
Jaguar animal class that can make sounds and play 
*/
public class Jaguar extends Animal{
    /*
    Cole Manchester Jaguar class
     */

    /**
     * A constructor that takes in a name.
     *
     * @param name Name of the animal.
     */
    public Jaguar(String name) {
        super(name);
    }

    /**
     * Sound() that the animal makes and
     */
    @Override
    public void sound() {
        System.out.println("Growl...");
    }
    /* 
    *play() prints the animal chews a stick
    */
    @Override
    public void play() {
        System.out.println("Find stick to chew");

    }
}
