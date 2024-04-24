

/**
* King Cobra class extends Animal 
* @author Kylianna Misiak
*/
public class KingCobra extends Animal{
   
   
   /**
    * A field which stores the animals name.
    */
   protected String name;
      
   
   /**
    * A constructor that takes in a name.
    * @param name Name of the King Cobra.
    */
   public KingCobra(String name){
      super(name);
   }
   
   
   /**
    * Method that represents the sound a King Cobra makes. 
    */
   @Override
   public void sound(){
      System.out.println("hiiiisssssss");
   }
   
   
   /**
    * Method that represents a specific  activity
    * that a King Cobra does to play.
    */
    @Override
   public void play(){
         System.out.println("The king cobra likes to stand up tall and look at its prey in the eyes.");
   }
}