/**
* Zebra class that extends Animal 
* Implements Zebra like behaviors 
*Assignment 3
*Eduardo GArcilazo
*/
public class Zebra extends Animal {

    /**
     * Constructs a Zebra with the given name.
     * @param name the zebra's name
     */
    public Zebra(String name) {
        super(name);
    }

    /** {@inheritDoc} */
    @Override
    public void sound() {
        System.out.println(name + " the Zebra snorts.");
    }

    /** {@inheritDoc} */
    @Override
    public void play() {
        System.out.println(name + " the Zebra runs across the field.");
    }
}
