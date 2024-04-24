/**
 * @author Yarixa Perez
 * Class that extends the abstract Animal class and
 * overrides all its abstract methods.
 */

public class Opossum extends Animal {
    /**
     * Constructor that takes in the name of the animal.
     * @param name Represents the name of the animal.
     */
    public Opossum(String name) {
        super(name);
    }

    /**
     * Prints the sound made by the animal.
     */
    @Override
    public void sound() {
        System.out.println("tsk-tsk-tsk-tsk-tsk!!");
    }

    /**
     * Prints what the animal is doing for fun.
     */
    @Override
    public void play() {
        System.out.println(this.name + " is playing dead.");
    }
}
