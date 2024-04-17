//Author: Jeremy Gutierrez
//Date: 4/17/2024
//File: Falcon extends Animal

public class Falcon extends Animal{


    /**
     * A constructor that takes in a name.
     *
     * @param name Name of the animal.
     */
    public Falcon(String name) {
        super(name);
    }

    /**
     * Sound method that tells us what a falcon sounds like
     */
    @Override
    public void sound() {
        System.out.println("kak kak kak");
    }

    /**
     * Play method tells us how a falcon plays
     */
    @Override
    public void play() {
        System.out.println(name + " like to hunt and fly for fun");
    }

    /**
     * A method that overrides the eat method
     * and prints out that the animal is eating food.
     */
    @Override
    public void eat() {
        super.eat();
    }
}



