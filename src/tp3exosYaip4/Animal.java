package tp3exosYaip4;

public class Animal {
	private String name;
	
	//====Constructor====
	public Animal(String name) {
		this.name = name; 
	}
	
	public String toString() {
		return "Animal[ name :" + name +" ]";
	}
	
	//====Test====
	public static void main(String[] args) {
        // Création d'un objet Animal
        Animal animal1 = new Animal("Lion");

        // Affichage de l'objet animal
        System.out.println(animal1);  // Utilisation de toString()
    }
}
