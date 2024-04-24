/**
* Zebra class that extends Animal
*/
public class Zebra extends Animal{
   /**
   * Constructor that takes in Zebra name
   * @param name Name of Zebra
   */
   public Zebra(String name){
      super(name);
   }
   /**
   * Method that prints out a Zebra sound
   */
   public void sound(){
      System.out.println("Snort");
   }
   /**
   * Method that prints out a Zebra activity
   */
   public void play(){
      System.out.println("Run");
   }
}
