public class Rabbit extends Animal {

    //Ethan Roppel 41753979

    /**
     * Default rabbit constructor
     * @param name The name of the rabbit being created.
     */
    public Rabbit(String name){
        super(name);
    }

    /**
     * A method that represents the sound the animal makes.
     */
    @Override
    public void sound(){
        System.out.println(this.name + " says Squeak");
    }


    /**
     * A method that represents the animal playing.
     */
    @Override
    public void play(){
        System.out.println(this.name + " plays with their toy");
    }


    /**
     * A method that prints out that the animal is eating food.
     */
    @Override
    public void eat(){
        System.out.println(this.name + " eats some food.");
    }

}