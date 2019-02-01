
public class RectangularPrism extends NonCircleShapes{

	public RectangularPrism(double width, double length, double height) {
		super(width, length, height);
		System.out.println("Type of shape: " + getName("Rectangular Prism") + "\nWidth: " + width + "cm\nLength: " + length +"cm\nHeight: " + height +"cm\nArea: " + getArea(width, length, height) + "cm Squared\nVolume: " + getVolume(width, length, height) + "cm Cubed" + "\n ");
	}
	
}
