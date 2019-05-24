package day08_Prob;

public class Circle extends Shape {
	private double radius;

	public Circle() {
		super();
	}
	
	public Circle(String name, double radius) {
		super(name);
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	@Override
	public void calculationArea() {
		area = (radius)*(radius)*(Math.PI);
	}
	public void print() {
		System.out.printf("%s의 면적은 %.13f%n",getName(),area);
	}
	
}
