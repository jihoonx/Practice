package ex;

public class Shape {
	protected int x,y;
	public void draw(){
		System.out.println("Shape Draw");
	}
}

class Rectangle extends Shape{
	private int width, height;
	public void draw(){
		System.out.println("Rectangle Draw");
	}
}
