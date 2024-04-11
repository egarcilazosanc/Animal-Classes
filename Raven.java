public class Raven extends Animal{
    
    public Raven(String name){
        super(name);
    }
    
    public void sound(){
        System.out.println("Caw Caw Caw");

    }

    public void play(){
        
        System.out.println("Ravens enjoy playing with sticks, by dropping them and catching them in the air")

    }

    public void eat(){
        System.out.println(this.name + " steals some of your pet food and eats it." + " Silly " + this.name);


    }


}
