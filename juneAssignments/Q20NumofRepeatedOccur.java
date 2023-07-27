package juneAssignments;

//find total number of repeated integers, uppercase and lowercase character in the give string

import java.util.Scanner;

public class Q20NumofRepeatedOccur {
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String :");
		
		String str=s.nextLine();
			
		int[] count=new int[str.length()];
		 //Converts given string into character array
		char[] str1=str.toCharArray();
		
		int len=str1.length;
		//Code to find Repeated Integers,Uppercase & Lower case char in given string
		
		for(int i=0;i<len;i++) {
			count[i]=1;
			 for(int j = i+1; j <len; j++) { 
			
				 if(str1[i] == str1[j] && str1[i] != ' ') {    
		                count[i]++;    
		                //Set string[j] to 0 to avoid printing visited character    
		                str1[j] = '0';    
		            }    
			 }
		}
	     
	    System.out.println("Number of Repeated Integers,Uppercase & Lower case Characters in a given string are \n ");    
	    for(int i = 0; i <count.length; i++) {    
	    	{ 
	            if(str1[i] !=' '&&str1[i]!='0') {    
	             System.out.println(str1[i] + "       " +count[i]);
	                   
	            }    
	        }    
	       
	}
	
	
s.close();
}
}