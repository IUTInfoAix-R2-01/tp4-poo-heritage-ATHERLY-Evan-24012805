package cycle;

import java.util.Random;

public class velo {
	private double braquet,diamRoue;
	private Random genAlea;
	private static double Defaut_braquet = 13.0;
	
	//constructor 
	public velo(final double braquet, final double diamRoue) {
		this.braquet = braquet;
		this.diamRoue = diamRoue;
		this.genAlea = new Random();
	}
	public velo(final double braquet) {
		this.braquet = braquet;
		this.genAlea = new Random();
	}
	public velo() {
		this.genAlea = new Random();
	}
	

	//Method
	public double getDefaut_braquet() {
		return this.Defaut_braquet;
	}
	public void setDefaut_braquet(double dEFAUT_BRAQUET) {
		this.Defaut_braquet = dEFAUT_BRAQUET;
	}
	public double getBraquet() {
		return braquet;
	}
	public void setBraquet(double braquet) {
		this.braquet = braquet;
	}
	public double getDiamRoue() {
		return diamRoue;
	}
	public void setDiamRoue(double diamRoue) {
		this.diamRoue = diamRoue;
	}
	public Random getGenAlea() {
		return genAlea;
	}
	public void setGenAlea(Random genAlea) {
		this.genAlea = genAlea;
	}
	
	@Override
	public double getPuissance(double FrequenceCoupsDePedale) {
		return FrequenceCoupsDePedale * this.braquet * this.diamRoue * this.genAlea.nextDouble();
	}
	@Override
	public String toString() {
		return "velo [braquet=" + braquet + ", diamRoue=" + diamRoue + ", genAlea=" + genAlea + "]";
	}
	
	public static void main (String[] args) {
		velo monVelo = new velo(2.0, 1.0);
		System.out.println(monVelo.getBraquet());
		System.out.println(monVelo.getDefaut_braquet());
		System.out.println(monVelo.getGenAlea());
		System.out.println(monVelo.getPuissance(10.0));
		System.out.println(monVelo);
	}
}
