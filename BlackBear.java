/**
    BlackBear class extends animal class implements and override
    sound(), play(), and eat() methods. 
 */
public class BlackBear extends Animal{

    /**
     * BlackBear class constructor takes name of the 
     * animal as an input. 
     * @param name the name of the animal. 
     */
    public BlackBear(String name){
        super(name);

    }

    /**
     * Sound() outputs the sound of a Black Bear. 
     */
    @Override
    public void sound(){
        System.out.println(name + " huffs or woofs.");
    }

    /**
     * play() outputs climbing trees that black bears do.
     */
    @Override
    public void play(){
        System.out.println(name + " like Climbing trees.");
    }

    /**
     * Prints black bear like salmon to eat. 
     */
    @Override
    public void eat(){
        System.out.println(name + " like to eat Salmon.");
    }
    
}