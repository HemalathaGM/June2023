//Write a Java Program to —
//3. To print the area(pi r2)and perimeter(2 pi r) of a circle.
package may25Assignment;

public class CircleAreaPeri {
	public static void main(String[] args) {
		
		double r=7.5;
		double perimeter=2*Math.PI*r;
		double area=Math.PI*r*r;
		
		System.out.println("The Perimeter of Circle is :" +perimeter);
		System.out.println("The Area of Circle is :" +area);
		
	}

}
