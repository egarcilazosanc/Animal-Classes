/**
*Abstract class Animal. Any class that extends this class
*will have to override all of the abstract methods. 
*@author Dmytro
*/
public class Goat extends Animal{
   
   
   /**
    * A field which stores the animals name.
    */
   protected String name;
      
   
   /**
    * A constructor that takes in a name.
    *@param name Name of the goat.
    */
   public Goat(String name){
      super(name);
   }
   
   
   /**
    *Abstract method that should represent a specific sound
    * a goat makes. 
    */
   @Override
   public void sound(){
      System.out.println("bleat");
   }
   
   
   /**
    * Abstract method that should represent a specific  activity
    * that a goat does for fun.
    */
    @Override
   public void play(){
         System.out.println("butt heads");
   }
   
   /**
    * A  method that prints out that the goat is eating food.
    */
   public void eat(){
      System.out.println(name + " eats some food.");
   }  
}


