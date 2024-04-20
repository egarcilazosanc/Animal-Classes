/**
 * Wolf class extends the abstract class Animal.
 * @author Vandan Amin
 */
public class Wolf extends Animal {
    /**
     * Constructor that accepts the name of the wolf.
     * @param name Name of the wolf.
     */
    public Wolf(String name) {
        super(name);
    }

    /**
     * the sound method prints the sound a wolf makes.
     */
    @Override
    public void sound() {
        System.out.println(this.name + " howls.");
    }

    /**
     * the play method prints what the wolf plays with his friends.
     */
    @Override
    public void play() {
        System.out.println(this.name + " plays tag with the other wolves.");
    }

    /**
     * the eat method prints what the wolf eats.
     */
    @Override
    public void eat() {
        System.out.println(this.name + " eats fresh meat.");
    }
}