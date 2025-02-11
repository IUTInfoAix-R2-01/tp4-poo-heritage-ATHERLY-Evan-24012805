package tp3exosYaip6;

public class ResizableCircle extends Circle implements Resizable {
	
	public ResizableCircle (double radius) {
		super(radius);
	}
	
	public String toString() {
		return "ResizableCircle[ " + super.toString() + "]";
	}
	@Override
	public void Resize(int percent) {
		radius *= percent/100.0;
	}
}
