package juneAssignments;

import java.util.Scanner;

public class Q14RevWords {
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=s.nextLine();		
		
		String s2[] = str. split(" ");
		
		String ans = "";
		for (int i = s2.length - 1; i >= 0; i--) {
		ans += s2[i] + " ";
		}
		System. out. println("Reversed String: " + ans);
		
		s.close();
	}

}
