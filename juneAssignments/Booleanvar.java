package juneAssignments;

import java.util.Scanner;

public class Booleanvar {
	
	public static void main(String[] args) {
		
	   Scanner s1=new Scanner(System.in);
	   System.out.println("Eneter Boolean value for a,b and c");
	   boolean a=s1.nextBoolean();
	   boolean b=s1.nextBoolean();
	   boolean c=s1.nextBoolean();
	   System.out.println("Boolean for variable a is :" +a);
	   System.out.println("Boolean for variable b is :" +b);
	   System.out.println("Boolean for varaiable c is :" +c);
	   s1.close();
	  
	System.out.println(booleanCount(a,b,c));
	
	
	}
	
	public static boolean booleanCount(boolean a,boolean b,boolean c) {
		int count=0;
		if(a) {
			count++;
		}
		if(b) {
			count++;
		}
		if(c) {
			count++;
		}
		return(count>=2);
	}
	
}
