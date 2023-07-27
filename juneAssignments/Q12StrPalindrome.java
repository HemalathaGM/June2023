package juneAssignments;

import java.util.Scanner;

public class Q12StrPalindrome {
	
	public static void main(String[] args) {
		//Program to print String is Palindrome or not
		String str,rev="";
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the String");
		str=s.nextLine();
		
		int len=str.length();
		for(int i=len-1;i>=0;i--)
			rev=rev+str.charAt(i);
		
		if(str.equals(rev))
			System.out.println(str+ " is a Palindrome ");
		else
			System.out.println(str+ " is not a Palindrome");
		
		
    //Program to check if given number is Palindrome or not		
		
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int num=s1.nextInt();
		
		
		 int  revNum = 0, rem;
		    
		    // store the number to originalNum
		    int originalNum = num;
		    
		    // get the reverse of originalNum
		    // store it in variable
		    while (num != 0) {
		      rem = num % 10;
		      revNum = revNum * 10 + rem;
		      num /= 10;
		    }
		    
		    // check if reversedNum and originalNum are equal
		    if (originalNum == revNum) {
		      System.out.println(originalNum + " is Palindrome.");
		    }
		    else {
		      System.out.println(originalNum + " is not Palindrome.");
		
		    }
		s.close();
		s1.close();
		
	}

}
