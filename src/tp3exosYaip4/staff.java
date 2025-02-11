package tp3exosYaip4;

public class staff extends Person{
	private String School;
	private double Pay;
	
	//=====Constructor====
	public staff (String School, double pay,String name, String address) {
		super (name,address);
		this.School = School;
		this.Pay = pay;
	}


	//=====Methods=====
	public String getSchool() {
		return School;
	}

	public void setSchool(String school) {
		School = school;
	}

	public double getPay() {
		return Pay;
	}

	public void setPay(double pay) {
		Pay = pay;
	}


	@Override
	public String toString() {
		return "staff [" + super.toString() + "School="+ School+", Pay=" + Pay + "]";
	}
	
	
	//=====Test=====
	public static void main(String[] args) {
        // Création d'un objet Staff
        staff staffMember = new staff("Université de Paris", 3500.50, "John Doe", "789 Rue de Lyon");

        // Affichage des informations initiales du staff
        System.out.println(staffMember);  // Utilisation de toString()

        // Modification de l'école et du salaire
        staffMember.setSchool("École Polytechnique");
        staffMember.setPay(4000.75);

        // Affichage après modification
        System.out.println("Après modification :");
        System.out.println(staffMember);
    }

}
