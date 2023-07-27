package may30Assignment;
import java.util.*;
public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double Perimeter,s,Area;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 3 sides of the Triangle:");
		double side1=sc.nextDouble();
		double side2=sc.nextDouble();
		double side3=sc.nextDouble();
		
		Perimeter=side1+side2+side3;
		s=Perimeter/2;
		Area=Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
		System.out.format("Print the Area of the Triangle=%.2f \n",Area );
		System.out.format("Print the Perimeter of the Triangle =%.2f \n", Perimeter);
		sc.close();
		
	}

}
