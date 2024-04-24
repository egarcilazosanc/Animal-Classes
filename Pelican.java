// Wyatt Wooden
// 04.17.24
// Pelican.java

public class Pelican extends Animal{
      
   /**
    * Pelican constructor that takes in a name.
    * @param name Name of the animal.
    */
   public Pelican(String name){
      super(name);
   }
   
   
   /**
    *Abstract method that should represent a specific sound
    * a Pelican makes. 
    */
   public void sound() {
   
      System.out.println("Graaaahk, hroooomph");
   
   }
   
   
   /**
    * Abstract method that should represent a specific  activity
    * that a Pelican does for fun.
    */
   public void play(){
   
      System.out.println(name + " the pelican is now flying!");
   
   }
   
   
   /**
    * A  method that prints out that the animal is eating food.
    */
   public void eat(){
      System.out.println(this.name + " eats some food.");
   }  
}


