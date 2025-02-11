package tp3exosYaip6;

public class Circle5 implements GeometriObject{
	protected double radius;

	public Circle5(double radius) {
		this.radius = radius;
	}
	@Override
	public String toString() {
		return "Circle5 [radius=" + radius + "]";
	}
	
	@Override
	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}
	@Override
	public double getArea() {
		return radius*radius*Math.PI;
	}
}
