package juneAssignments;

import java.util.Scanner;

public class Q28FactorialNumRecurrsion {



	    public static void main(String[] args) {
	    	
	    	Scanner s=new Scanner(System.in);
	    	System.out.println("Enter the Number");
	    	int num=s.nextInt();
	    		       
	        long factorial = multiplyNumbers(num);	        
	      System.out.println("Factorial of " + num + " = " + factorial);
	      
	      s.close();   
	    }
	    
	    public static long multiplyNumbers(int num)
	    {
	        if (num >= 1)
	            return num * multiplyNumbers(num - 1);
	        else
	            return 1;
	        
	        
	  
	    }
	    
	     
	}
	
	
	

