package ex;

public class Triangle extends Shape{
	private int base, height;
	public void draw(){
		System.out.println("Triangle Draw");
	}
}
class Circle extends Shape{
	private int radius;
	
	public void draw(){
		System.out.println("Circle Draw");
	}
}
