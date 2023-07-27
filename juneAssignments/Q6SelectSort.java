package juneAssignments;

import java.util.Scanner;

public class Q6SelectSort {

	public void sort(int array[]) {
		
		int n= array.length;
		for(int i=0;i<n-1;i++) {
			int min_element=i;
			for (int j = i+1; j < n; j++)
				if (array[j] < array[min_element])
				min_element = j;
				int temp = array[min_element];
				array[min_element] = array[i];
				array[i] = temp;
				}
				}
				// Method to print the elements of an array
				void printarrayay(int array[])
				{
				int n = array.length;
				for (int i=0; i<n; ++i)
				System.out.print(array[i]+" ");
				System.out.println();
				}
				// Main Method
  public static void main(String args[])
				{
	            Q6SelectSort ob = new Q6SelectSort();
				//int array[] = {15, 10, 99, 53, 36};
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
				ob.sort(array);
				System.out.println("Sorted arrayay");
				ob.printarrayay(array);
				
			s.close();
			
		}
		
		
		
	}
	
	
	
	
