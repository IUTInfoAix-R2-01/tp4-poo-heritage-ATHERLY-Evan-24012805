package cycle;

public class veloElec extends velo{
	private static double Defaut_Facteur_Puissance_Moteur = 15.0;
	private double facteurPuissanceMoteur;
	
	//construtor
	public veloElec(double braquet, double diamRoue, double coupleMoteur) {
		super (braquet, diamRoue);
		this.facteurPuissanceMoteur = coupleMoteur;
	}
	public veloElec(double braquet, double coupleMoteur) {
		super (braquet);
		this.facteurPuissanceMoteur = coupleMoteur;
	}
	public veloElec() {}
	
	//Method
	public static double getDefaut_Facteur_Puissance_Moteur() {
		return Defaut_Facteur_Puissance_Moteur;
	}
	public static void setDefaut_Facteur_Puissance_Moteur(double defaut_Facteur_Puissance_Moteur) {
		Defaut_Facteur_Puissance_Moteur = defaut_Facteur_Puissance_Moteur;
	}
	public double getFacteurPuissanceMoteur() {
		return facteurPuissanceMoteur;
	}
	public void setFacteurPuissanceMoteur(double facteurPuissanceMoteur) {
		this.facteurPuissanceMoteur = facteurPuissanceMoteur;
	}
	
	public double getPuissance(double FrequenceCoupsDePedale) {
		return super.getPuissance(FrequenceCoupsDePedale) * this.facteurPuissanceMoteur;
	}
	@Override
	public String toString() {
		return "veloElec [facteurPuissanceMoteur=" + facteurPuissanceMoteur + "]";
	}
	
	public static void main (String[] args) {
		veloElec monVelo = new veloElec(2.0, 1.0);
		System.out.println(monVelo.getBraquet());
		System.out.println(monVelo.getDefaut_braquet());
		System.out.println(monVelo.getGenAlea());
		monVelo.setFacteurPuissanceMoteur(10.0);
		System.out.println(monVelo.getFacteurPuissanceMoteur());
		System.out.println(monVelo.getPuissance(10.0));
		System.out.println(monVelo);
	}
	
}
