public class Alpaca extends Animal {

    public Alpaca() {
        super("Alpaca");
    }

    /**
    *Abstract method that should represent a specific sound
    * an animal makes. 
    */
   public void sound() {
        System.out.println("𝘩𝘮𝘮𝘮𝘮𝘮𝘮𝘮𝘮𝘮𝘮");
   }
   
   
   /**
    * Abstract method that should represent a specific  activity
    * that an animal does for fun.
    */
   public void play() {
        System.out.println("Spits at locals passing by");
   }

}
