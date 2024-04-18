/**
 * Class chameleon that extends animal
 *
 * @author Austin Snyder
 */
public class Chameleon extends Animal{
    /**
     * Chameleon constructor calls animal constructor with name
     * @param name The string name of a chameleon
     */
    public Chameleon(String name) {
        super(name);
    }


    /**
     * Prints out the sound a chameleon makes
     */
    @Override
    public void sound() {
        System.out.println("hiss");
    }


    /**
     * Prints out how a chameleon plays
     */
    @Override
    public void play() {
        System.out.println("Starts climbing");
    }


    /**
     * Prints what the chameleon likes to eat
     */
    @Override
    public void eat(){
        System.out.println("Likes to eat bugs!");
    }
}
