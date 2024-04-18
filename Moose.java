//Name: Stephen Nugent
//Date: 4/17/24
//Course: CS 380

/* Lab 3 Objective:

Write a Java program that extends the animal class.
Override abstract methods and once finished push to
a public repository alongside classmates. */

public class Moose extends Animal{

    /**
     * A constructor that takes in a name.
     * @param name Name of the animal.
     */
    public Moose(String name) {
        super(name);
    }

    /**
     * A method that overrides an animal abstract class.
     * Will print out the sound a Moose makes (challenging).
     */
    public void sound() {
        System.out.println("Errrr Uhhhhh!\n");
    }

    /**
     * A method that overrides an animal abstract class.
     * Will print out how the Moose plays.
     */
    public void play() {
        System.out.println("The Moose runs through a meadow...\n");
    }

    /**
     * A method that overrides an animal class that I believe was meant to be abstract.
     * Will print out what the Moose eats.
     */
    public void eat() {
        System.out.println(name + " drinks some maple syrup!\n");
    }
}