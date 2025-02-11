package tp3exosYaip4;

public class Student extends Person {
	private String program;
	private int year;
	private double fee;
	
	//=====Construcor=====
	public Student(final String name, final String address, final String program,final int year, final double fee) {
		super(name,address);
		this.program = program;
		this.year = year;
		this.fee = fee;
	}

	//=====Methods====
	public String getProgram() {
		return program;
	}

	public void setProgram(String program) {
		this.program = program;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	@Override
	public String toString() {
		return "Student[ "+super.toString() + "[program=" + program + ", year=" + year + ", fee=" + fee + "]";
	}
	
	//=====Test====
	public static void main(String[] args) {
        // Création d'un objet Student
        Student student1 = new Student("Alice", "123 Rue de Paris", "Informatique", 2, 1500.75);

        // Affichage des informations du student
        System.out.println(student1);  // Utilisation de toString()

        // Modification du programme, de l'année et des frais
        student1.setProgram("Mathématiques");
        student1.setYear(3);
        student1.setFee(1800.50);

        // Affichage après modification
        System.out.println("Après modification :");
        System.out.println(student1);
    }
}
