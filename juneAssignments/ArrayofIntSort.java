package juneAssignments;
import java.util.Scanner;

public class ArrayofIntSort {	
	
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
		int temp;
		for(int i=0;i<array.length;i++) {
			for(int j=i;j<array.length;j++) {
				if(array[i]>array[j]) {
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}				
			}
		}		
        System.out.println("Sorted array is ");
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i] + " ");
		}
		
		s.close();
	}
		
}
