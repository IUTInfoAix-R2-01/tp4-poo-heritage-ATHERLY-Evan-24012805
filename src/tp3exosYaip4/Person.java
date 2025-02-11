package tp3exosYaip4;

public class Person {
	private String name, address;
	
	public Person(String name,String address) {
		this.name = name; 
		this.address = address;
	}
	// ======Methods======
	public String getAddress() {
		return address;
	}

	public void setAddress(String adress) {
		this.address = adress;
	}

	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", adress=" + address + "]";
	}
	
	//=====Test=====
	public static void main(String[] args) {
        // Création d'un objet Person
        Person person1 = new Person("Alice", "123 Rue de Paris");

        // Affichage des informations initiales
        System.out.println("Nom : " + person1.getName());
        System.out.println("Adresse : " + person1.getAddress());

        // Modification de l'adresse
        person1.setAddress("456 Avenue des Champs");

        // Vérification après modification
        System.out.println("Nouvelle adresse : " + person1.getAddress());

        // Affichage de l'objet avec toString()
        System.out.println(person1);
    }
}
