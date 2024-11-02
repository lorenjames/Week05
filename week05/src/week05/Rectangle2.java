package week05;

public class Rectangle2 implements Shape{
	
	private double width;
	private double length;

	@Override
	public double calculatePerimeter() {
		// TODO Auto-generated method stub
		return 2 * (this.width + this.length);
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return this.width * this.length;
	}

}
