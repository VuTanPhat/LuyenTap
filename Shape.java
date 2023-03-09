package Shape;

public abstract class Shape {
	String color;
	boolean filled;
	public Shape(String color,boolean filled) {
		this.color=color;
		this.filled=filled;
	}
	public String getcolor() {
		return color;
	}
	public boolean getfilled() {
		return filled;
	}
}
public class Circle extends Shape{
	double radius=1;
	public Circle(String color,boolean filled,double radius) {
		super(color,filled);
		this.color=color;
		this.filled=filled;
		this.radius=radius;
	}
}
