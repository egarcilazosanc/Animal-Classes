public class Shark extends Animal {
    /**
     * A constructor that takes in a name.
     *
     * @param name Name of the animal.
     */
    public Shark(String name) {
        super(name);
    }
    
    @Override
    public void sound() {

        System.out.println(name + "\sbarks loudly!");

    }

    @Override
    public void play() {

        System.out.println(name + "\svigorously swims in circles!");

    }
}
