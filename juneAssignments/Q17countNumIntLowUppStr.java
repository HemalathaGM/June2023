package juneAssignments;

import java.util.Scanner;

public class Q17countNumIntLowUppStr {
	
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String :");
		
		String str=s.nextLine();
		int cUpp=0;
		int cLow=0;
		int cInteger=0;
		char[] str1=str.toCharArray();
		
		int len=str1.length;
		
		for(int i=0;i<len;i++) {
			
			int charAsciiValue=str1[i];
			
			if(charAsciiValue>=65 && charAsciiValue<=90) {
				cUpp++;
				
				
			 }else if(charAsciiValue>=97 && charAsciiValue<=122) {
				
				cLow++;
			
			
			}else if(charAsciiValue>=48 && charAsciiValue<=57) {
				cInteger++;
		}
				
		
	}
   s.close();
   
   System.out.println("Number of Upper case Char in a given string " +cUpp);
   System.out.println("Number of Lower cae Char in a given String " +cLow);
   System.out.println("Number of Integer in a given String " +cInteger);
   
}
}