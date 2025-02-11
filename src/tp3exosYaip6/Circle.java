package tp3exosYaip6;

public class Circle implements GeometricObject{
	protected double radius;
	
	public Circle (double radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
	@Override
	public double getArea() {
		return radius*radius*Math.PI;
	}
	@Override
	public double getPerimeter() {
        return 2 * Math.PI * radius;  // Calcul du périmètre
    }
	
	public static void main(String[] args) {
        // Création d'un cercle avec un rayon de 5
        Circle circle = new Circle(5);

        // Affichage des informations du cercle
        System.out.println(circle);

        // Affichage de l'aire et du périmètre du cercle
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());
    }
}
