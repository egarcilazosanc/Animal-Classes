/**
 * Chipmunk
 */
public class Chipmunk extends Animal {

   /**
    * Constructor that calls the parent constructor for {@link Animal}
    *
    * @param name The name of the animal
    */
   public Chipmunk(String name) {
      super(name);
   }

   /**
    * Prints a description of a sound a Chipmunk might make
    * an animal makes.
    */
   public void sound() {
      System.out.println("The Chipmunk makes a high-pitched \"Chip-Chip\" noise");

   }

   /**
    * Prints a description of the Chipmunk engaging in recreation
    *
    */
   public void play() {
      System.out.println("The Chipmunk hides acorns for fun.");
   }

}
