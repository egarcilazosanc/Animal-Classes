public class Peacock extends Animal{
    /**
     * peacock constructor
     * only requires a name as input.
     * @param name
     */
    public Peacock(String name){
            super(name);
    }
    /**
     * getter so we can use the name from main if we so choose.
     * @return
     */
    public String getName(){
            return name;
    }
    /**
     * peacocks are known to make a call that is often characterized as a drawn out meow, like that of a cat,
     * but much louder and vocal.
     */
    public void sound(){
            System.out.println("Meeeowwwwww");
    }
    /**
     * Peacocks are most notable for their wide fanning tail feathers. This play() method
     * characterizes this.
     */
    public void play(){
        System.out.println(name + " struts around, fanning " + name + "'s beautiful tail feathers.");
    }
    /**
     * Our peacock is awfully curious, and likes to take his time as he eats.
     */
    public void eat(){
        System.out.println(name + " pecks at the grains, " + name + "'s mind wanders in a maze of existential musings. " +"\n"+
                name + " contemplates the marvel of " + name + "'s existence - a creature of vibrant feathers and keen eyes, " +"\n"+
                "birthed from the cosmic dance of atoms and the relentless flow of time. Each peck seems to echo the age-old rhythms " +"\n"+
                "of nature, a ballet of biological wonders evolving from microscopic entities to magnificent beings. With each morsel, " +"\n"+
                name + " ponders the intricate web of life, where each creature plays a part in the grand tapestry of the ecosystem. " +"\n"+
                "From the tiniest insect to the grandeur of " + name + " itself, every form of life is a testament to the incredible journey " +"\n"+
                "of evolution. Here " + name + " stands, a creature not just consuming its meal, but also feasting upon the profound mysteries of existence. " +"\n"+
                "In this moment of introspection, " + name + ", stunned by the depth of its own thoughts, yet content in its role in the universe, returns " +"\n"+
                "to its humble meal, a mere participant in the ongoing saga of life.");
    }
}
