
public class NonCircleShapes implements Shapes {
	private double width;
	private double height;
	private double length;
	private String name;
	
	public NonCircleShapes(double width,double length,double height) {
		this.length=length;
		this.height=height;
		this.width=width;
	}
	
	public String getName(String name) {
		return name;
	}
	
	public double getArea(double width, double length,double height) {
		return 2 * ((width * height) + (width * length) + (length * height));
	}
	
	public double getVolume(double width, double length,double height) {
		return height*width*length;
	}

}
