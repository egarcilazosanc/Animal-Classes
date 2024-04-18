/**
 * Extension of the {@link Animal} class to implement Alpaca behavior
 * @see Animal
 */
public class Alpaca extends Animal {
    
    /**
     * Constructs a new Alpaca
     * @see Animal#Animal
     */
    public Alpaca() {
        super("Alpaca");
    }

    /**
     * Method that represents an Alpaca sound.
     * @see Animal#sound
     */
   public void sound() {
        System.out.println("𝘩𝘮𝘮𝘮𝘮𝘮𝘮𝘮𝘮𝘮𝘮");
   }
   
   
   /**
    * Method that represents an Alpaca's favorite activity.
    * @see Animal#play    
    */
   public void play() {
        System.out.println("Spits at locals passing by");
   }

}
