

// Insertion Sort = After Comparing Elements to the Left Shift Elements to the right to make room to insert a value

package juneAssignments;

import java.util.Scanner;

public class InsertionSort {
	
	public static void main(String[] args) {
		
		//int array[]= {9,1,8,2,7,3,6,5,4};
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=s.nextInt();
		System.out.println("Enter the array Elements");
		int[] array=new int[n];
		for(int i=0;i<n;i++) {
			array[i]=s.nextInt();
		}
		System.out.println("Print the entered array Element");
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		insertionSort(array);
		System.out.println("Print the Sorted insertion sort Elements");
		for(int i=0;i<array.length;i++) {
	
			System.out.print(array[i] + " ");
		}
		s.close();
	}
	
	private static void insertionSort(int[] array)
	{
		for(int i=1;i<array.length;i++) {
			int temp = array[i];
			int j= i-1;
			
			while(j >= 0 && array[j] > temp) {
				
				array[j +1] = array[j];  //Shift an Element to the Right
				j--;
				
				
			}
			array[j+1]=temp;  // Insert the value found within temp
		}
	}

}
