package juneAssignments;

import java.util.Scanner;

public class Factorial {
	
	public static int fact(int n) {
		int fact=1;
		if(n==0) 
			return 1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		return fact;
			
		}	
		
		public static void main(String[] args) {
			
			Scanner s1= new Scanner(System.in);
			System.out.println("Enter the number to print its Factorial:" );
			int n=s1.nextInt();
					
			System.out.println("Entered number is " +n);
			
			System.out.println("The factorial of number "  +n   +" is "  +fact(n));
			
			s1.close();
		}
	}
	


