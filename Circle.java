package prac2;

public class Circle {
	private int radius;
	private Point center;
	
	public Circle(Point p,int r){
		center=p;
		radius=r;
	}
	public String toString(){
		return "circle[radius="+radius+",center="+center+"]";
	}
}