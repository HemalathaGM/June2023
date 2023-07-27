package juneAssignments;

import java.util.Scanner;

public class Q24ConsecutiveNaturalNum {
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		//Taking input
		System.out.println("Enter the number:");
		int n=s.nextInt();
		//finding combinations
		for(int i=1;i<=n/2+1;i++)
		{
		int sum=0;
		int j=i;
		while(sum< n)
		{
		sum=sum+j;

		j++;}//inner loop ends
		if (sum==n)
		{
		System.out.println("Possible consecutive combinations are : ");
		for(int k=i;k<j;k++) { 		
		System.out.print(" " +k);		
		}
		System.out.println();
		
		}//if ends
		}//outer loop ends
		s.close();
		}//method ends
     
		
	}
	


