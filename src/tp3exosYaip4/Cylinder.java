package tp3exosYaip4;

public class Cylinder {
	private Circle base;   // Base circle, an instance of Circle class
	private double height;
	   
	// Constructor with default color, radius and height
	public Cylinder() {
		base = new Circle(22.0,"GREEN"); // Call the constructor to construct the Circle
	    height = 1.0; 
	}
}
