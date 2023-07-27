package juneAssignments;

import java.util.Scanner;

public class Q16RemoveCharfromString {
	
	public static void main(String [] args) {
		Scanner sc= new Scanner(System.in);
        System.out.print("Please give a String : ");  
        String str= sc.nextLine();  
        Scanner sc1= new Scanner(System.in);
        System.out.print("Please give a Char : ");  
        String ch= sc1.nextLine();
        System.out.println(charToRemove(str, ch));
        
        sc.close();
        sc1.close();
    }  
    public static String charToRemove(String str, String ch){
        return str.replaceFirst(ch," ");
		
        
       
        
	}
		

}
