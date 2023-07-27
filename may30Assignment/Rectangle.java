package may30Assignment;

public class Rectangle {

	
	double length;
	double width;

	public Rectangle(double l, double w)
	{
		length=l;

		width=w;
	}
	
	
	public double getArea()
	{
		return length*width;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangle R1=new Rectangle(4,5);
		Rectangle R2=new Rectangle(5,8);
		System.out.println("Area of Rectangle is :" +R1.getArea());
		System.out.println("Area of Rectangle is :" +R2.getArea());
		
		
	}


}