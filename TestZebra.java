
/**
 * Test driver for zebra
 * 
 */

public class TestZebra {

	public static void main(String[] args) {
	
		        Zebra z = new Zebra("Spagehtti");
		        z.sound(); // abstract override
		        z.play();  // abstract override
		        z.eat();   // concrete method from Animal
		        System.out.println("Done testing " + z.getClass().getSimpleName());
		    }
		

	}


