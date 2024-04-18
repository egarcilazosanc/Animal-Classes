public class Alligator extends Animal
{
    /**
     * Constructor creates alligator object with a specified name.
     * @param name String name of alligator
     */
    public Alligator(String name)
    {
        super(name);
    }

    /**
     * Prints output of alligator noises.
     */
    @Override
    public void sound()
    {
        System.out.print("*growls and bellows*\n");
    }

    /**
     * Prints output of alligator recreational activities.
     */
    @Override
    public void play()
    {
        System.out.print("*plays will ball and chases friends\n");
    }
}
