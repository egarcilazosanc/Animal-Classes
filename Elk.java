/**
*Elk class extends Animal.
*@author Max Gochenour
*/
public class Elk extends Animal{

   /**
    * A constructor that takes in a name.
    *@param name Name of the Elk.
    */
   public Elk(String name){
      super(name);
   }
   
   /**
   *  Method that prints the specific sound an Elk makes.
   */
   @Override
   public void sound(){
      System.out.println("Grrrr AAAAAAA");
   }
   
   /**
   *  Method that prints the specific way an Elk plays.
   */
   @Override
   public void play(){
      System.out.println(this.name + " is bashing antlers");
   }
   
   /**
   *  Method that prints the specific way an Elk eats.
   */
   @Override
   public void eat(){
      System.out.println(this.name + " eats some Bark.");
   }
}