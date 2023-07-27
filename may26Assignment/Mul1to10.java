package may26Assignment;

import java.util.Scanner;

public class Mul1to10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner reader=new Scanner(System.in);
		
		System.out.println("Enter the multiplication table upto :");
		int mul=reader.nextInt();
		
		for(int i=1;i<=mul;i++) {
			System.out.println("========================================");
			System.out.println("Multiplication Table of " +i +" " +"Times" );
			System.out.println("========================================");
		   for(int j=1;j<=12;j++) {
			int val=i*j;
			
			System.out.println(+i +" x " +j +"=" +val );
			
			reader.close();
		
		}
		   
	 }
	}

}
