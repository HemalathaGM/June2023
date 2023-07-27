package juneAssignments;

import java.util.Scanner;

public class Q13RevString {
	
	public static void main(String[] args) {
		
		/*Given a string print the reverse of the string.
		 * (Input: Java Code Output: edoC avaJ)
		 */
		
		String str,rev="";
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the String");
		str=s.nextLine();
		
		int len=str.length(); 
		for(int i=len-1;i>=0;i--)
			 rev=rev+str.charAt(i);
			 System.out.println(rev);
		
		s.close();
		
		 
	}
	
	

}
