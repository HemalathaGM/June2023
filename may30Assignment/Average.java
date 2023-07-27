package may30Assignment;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the First Number:");
		int  First=s.nextInt();
		System.out.println("Enter the Second Number:");
		int Second=s.nextInt();
		System.out.println("Enter the Third Number:");
		int Third=s.nextInt();
		
		double Average=(First+Second+Third)/3;
		System.out.format("The Average of 3 Numbers is %.2f", Average);
		
		s.close();
		
	}

}
