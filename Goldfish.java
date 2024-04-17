/**
 * Goldfish class that extends animal and impliments some abstract and custom methods 
 * @author Eli Holter
 */
public class Goldfish extends Animal{

   /**
    * extended class fields to represent attributes of a goldfish.
    */
   protected String color, favoriteFood = "Blamco Brand \"Fishy Flakes\"";
   protected boolean stripes;
   protected double weight_g, length_cm;
   

   /**
    * Goldfish constructor with custom favoriteFood attribute.
    * @param name Name of the goldfish.
    * @param color Color of the goldfish.
    * @param favoriteFood The goldfish's favorite food.
    * @param stripes Boolean has stripes.
    * @param weight_g Weight in grams.
    * @param length_cm Length in centimeters.
    */
   public Goldfish(String name, String color, String favoriteFood, boolean stripes, double weight_g, double length_cm) {
      super(name);
      this.color = color;
      this.favoriteFood = favoriteFood;
      this.stripes = stripes;
      this. weight_g = weight_g;
      this.length_cm = length_cm;
      normalizeDoubles();
   }
   
   /**
    * Goldfish constructor without custom favoriteFood attribute.
    * @param name Name of the goldfish.
    * @param color Color of the goldfish.
    * @param stripes Boolean has stripes.
    * @param weight_g Weight in grams.
    * @param length_cm Length in centimeters.
    */
   public Goldfish(String name, String color, boolean stripes, double weight_g, double length_cm) {
      super(name);
      this.color = color;
      this.stripes = stripes;
      this. weight_g = weight_g;
      this.length_cm = length_cm;
      normalizeDoubles();
   }

   /**
    * Helper function to bring the weight and length into realistic ranges (you cant have negative or zero weight or height).
    */
   private void normalizeDoubles() {
      if(this.weight_g < 0) {
         this.weight_g *= -1;
      }
      else if(this.weight_g == 0) {
         this.weight_g += 1;
      }

      if(this.length_cm < 0) {
         this.length_cm *= -1;
      }
      else if(this.length_cm == 0) {
         this.length_cm += 1;
      }
   }

   /**
    * Method to grow the goldfish's weight and height by a specified multiplier. Analogous to goldfish aging.
    * @param multiplier Double value to multiply length and weight by.
    */
   public void grow(double multiplier) {
      if(multiplier < 0) {
         multiplier *= -1;
      }
      else if(multiplier == 0) {
         multiplier += 1;
      }
      this.weight_g *= multiplier;
      this.length_cm *= multiplier;

      System.out.println(this.name + " the goldfish grew by a factor of " + multiplier + "!");
   }
   
   /**
    * Void method to print what sound this goldfish makes based on it's weight.
    */
   public void sound() {
      String sound = "";
      if(weight_g < 10) {
         sound = "Blub blub";
      }
      else if(weight_g < 20) {
         sound = "Splash!";
      }
      else if(weight_g < 30) { 
         sound = "Kerplunk!!";
      }
      else {
         sound = "Skadoosh!!!";
      }

      System.out.println(this.name + " the goldfish says: " + sound);
   }
   
   
   /**
    * Void method to print what activity this goldfish likes doing for fun based on it's length.
    */
   public void play() {
      String activity = "";
      if(length_cm < 10) {
         activity = "swims around";
      }
      else if(weight_g < 20) {
         activity = "flurries it's tail-fin";
      }
      else if(weight_g < 30) { 
         activity = "jumps into the air and lands back in the water";
      }
      else {
         activity = "jumps from one tank to another";
      }

      System.out.println(this.name + " the goldfish " + activity + "!");
   }
   
   
   /**
    * Void method to print what the goldfish eats when it eats.
    */
   public void eat(){
      System.out.println(this.name + " the goldfish eats some " + this.favoriteFood + ".");
   }

   /**
    * Overridden toString method to return all goldfish information.
    */
   public String toString() {
      return (this.name + " the goldfish:\n------------------------" + 
              "\nColor:\t" + this.color + 
              "\nHas strips:\t" + stripes + 
              "\nFavorite food:\t" + favoriteFood + 
              "\nWeight in grams:\t" + weight_g +
              "\nLength in centimeters:\t" + length_cm + 
              "\n");
   }
}


