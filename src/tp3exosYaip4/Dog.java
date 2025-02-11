package tp3exosYaip4;

public class Dog extends Mammal {
	
	//====Constructor====
	public Dog(String name) {
		super(name);
	}
	
	//====Fonctions====
	public void greets() {
		System.out.print("woof");
	}
	public void greets(Dog another) {
		System.out.print("wooooof");
	}
	@Override
	public String toString() {
		return "Dog[" + super.toString()+"]";
	}
	
	//====Test====
	public static void main(String[] args) {
        // Création d'objets Dog
        Dog dog1 = new Dog("Rex");
        Dog dog2 = new Dog("Buddy");

        // Affichage des objets dog
        System.out.println(dog1);  // Utilisation de toString()
        System.out.println(dog2);  // Utilisation de toString()

        // Appel de la méthode greets()
        dog1.greets();  // Affiche "woof"
        System.out.println(); // Pour passer à la ligne suivante
        dog2.greets(dog1);  // Affiche "wooooof"
    }
}
