package juneAssignments;

import java.util.Scanner;

public class Q5DupOccurNum {
	
	public static void main(String[] args) {
		

		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of elements to store");		
		int n =s.nextInt();		
		System.out.println("Enter the array elements");
		int[] array = new int[n];
		for(int i=0;i<n;i++) {
			array[i]=s.nextInt();							
		}
		System.out.println("Print the entered Array Elements :");
		for(int i=0;i<=n-1;i++) {
			
		   System.out.print(array[i] + " ");
		}		
		System.out.println("\nSize of the entered array is " +array.length );
				
	    System.out.println("Duplicate Numbers are");    
	   
	    for(int i = 0; i <array.length; i++) {    
	        
	        for(int j = i+1; j <array.length; j++) {    
	            if((array[i] == array[j]) && (i != j))
	            {
	            	System.out.println(array[j]);
	            }
	            
	           
	s.close();
		
		
	}
	
	
	    }
	}	    
}