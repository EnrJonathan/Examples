
public class TriangularPrism extends NonCircleShapes {
	private double base;

	public TriangularPrism(double width, double length, double height) {
		super(width, length, height);
		this.base = getBase(width, length);
		System.out.println("Type of shape: " + super.getName("Triangular Prism") + "\nSide 1: " + width + "cm\nSide 2: " + length +"cm\nHeight: " + height +"cm\nBase: " + base + "cm Squared\nArea: " + getArea(base , height) + "cm Squared\nVolume: " + getVolume(base, height) + "cm Cubed" + "\n ");
	}
	
	public double getArea(double base,double height) {
		return 0.5 * height * base;
	}
	public double getVolume(double base,double height) {
		return height*base;
	}
	
	public double getBase(double width, double length) {
		return 0.5 *(length * width);
	} 

}
