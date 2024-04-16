/**
 * Raven class that extends Animal
 * @author Noah Rodal
 * 
 */

public class Raven extends Animal{
    
    /**
     * Raven constructor
     * @param name
     */
    public Raven(String name){
        super(name);
    }
    
    /**
     * prints out the sound a raven makes
     */
    public void sound(){
        System.out.println("Caw Caw Caw");

    }

    /**
     * prints out the way a raven plays
     */
    public void play(){
        
        System.out.println("Ravens enjoy playing with sticks, by dropping them and catching them in the air");

    }


    /**
     * prints out that the raven is eating
     */
    public void eat(){
        System.out.println(this.name + " steals some of your food and eats it." + " Silly " + this.name);


    }


}
