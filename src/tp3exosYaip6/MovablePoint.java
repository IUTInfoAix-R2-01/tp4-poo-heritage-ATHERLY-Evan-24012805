package tp3exosYaip6;

public class MovablePoint implements Movable{
	int x,y,xSpeed,ySpeed;

	public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
		super();
		this.x = x;
		this.y = y;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}

	@Override
	public String toString() {
		return "MovablePoint [x=" + x + ", y=" + y + ", xSpeed=" + xSpeed + ", ySpeed=" + ySpeed + "]";
	}
	@Override
	public void moveUp() {
		y-=this.ySpeed;
	}
	@Override
	public void moveDown() {
		y+=this.ySpeed;
	}
	@Override
	public void moveLeft() {
		x-=this.xSpeed;
	}
	@Override
	public void moveRight() {
		x-=this.xSpeed;
	}
	
	public static void main(String[] args) {
        // Création d'un objet MovablePoint avec des coordonnées initiales (x=0, y=0) et une vitesse de 2 pour chaque direction
        MovablePoint point = new MovablePoint(0, 0, 2, 2);
        
        // Affichage de l'état initial du point
        System.out.println("Initial State: " + point);
        
        // Déplacer le point vers le haut
        point.moveUp();
        System.out.println("After moving up: " + point);
        
        // Déplacer le point vers le bas
        point.moveDown();
        System.out.println("After moving down: " + point);
        
        // Déplacer le point vers la gauche
        point.moveLeft();
        System.out.println("After moving left: " + point);
        
        // Déplacer le point vers la droite
        point.moveRight();
        System.out.println("After moving right: " + point);
    }
}
