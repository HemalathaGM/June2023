package juneAssignments;

//Q23: WJP to differentiate input as string, int or bool
import java.util.Scanner;

public class Q23DiffStrIntBool {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    System.out.println("Enter the input to check for Integer or String ");
	    System.out.println(" ");
	   
		if (input.hasNextInt()) 
			System.out.println("This input is of type Integer.");
		
		    
		
		else if (input.hasNextLine()) 		   
		       
			System.out.println("This input is of type string."); 
		
		 //To check if entered string is  boolean type
		
		 String str = input.next();
		if(str.equalsIgnoreCase("true")||str.equalsIgnoreCase("false")){
			
		    System.out.println("Given string is a boolean type");
		    }
		
		else 
		    System.out.println("Given string is not a boolean type");
			
		  
		input.close();
		
	}
	
	}

