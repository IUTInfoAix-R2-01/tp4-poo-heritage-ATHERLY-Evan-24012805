package tp3exosYaip4;

public class Mammal extends Animal{
	//====Constructor====
	public Mammal (String name) {
		super(name);
	}
	
	@Override
	public String toString() {
		return "Mammal ["+super.toString()+"]"; 
	}
	
	//====Test====
	 public static void main(String[] args) {
	        // Création d'un objet Mammal
	        Mammal mammal1 = new Mammal("Elephant");

	        // Affichage de l'objet mammal
	        System.out.println(mammal1);  // Utilisation de toString()
	    }
}
