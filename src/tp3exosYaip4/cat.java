package tp3exosYaip4;

public class cat extends Mammal {
	
	//====constructor====
	public cat(String name) {
		super(name);
	}
	//====Fonctions====
	public void greets() {
		System.out.print("Meow");
	}
	
	@Override
	public String toString() {
		return "Cat[" + super.toString()+"]";
	}
	
	//====Test====
	public static void main(String[] args) {
        // Création d'un objet Cat
        cat cat1 = new cat("Whiskers");

        // Affichage de l'objet cat
        System.out.println(cat1);  // Utilisation de toString()

        // Appel de la méthode greets()
        cat1.greets();  // Affiche "Meow"
    }
	
}
