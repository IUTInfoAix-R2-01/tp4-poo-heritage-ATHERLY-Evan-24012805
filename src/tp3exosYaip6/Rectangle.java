package tp3exosYaip6;

public class Rectangle implements GeometricObject {
	private double width, lenght;

	public Rectangle(double width, double lenght) {
		super();
		this.width = width;
		this.lenght = lenght;
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", lenght=" + lenght + "]";
	}
	
	@Override
	public double getPerimeter() {
		return this.lenght * 2 + this.width * 2;
	}
	
	@Override
	public double getArea() {
		return this.lenght * this.width;
	}

}
