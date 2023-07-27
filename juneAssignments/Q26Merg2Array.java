package juneAssignments;

import java.util.Scanner;

public class Q26Merg2Array {

	public static void main(String[] args) {
		
		
		Scanner s=new Scanner(System.in);
	
		System.out.println("Enter the size of array");
		int n1=s.nextInt();
		System.out.println("Enter the values of the array:");
		int[] array1=new int[n1];
		for(int i=0;i<n1;i++) {
			array1[i]=s.nextInt();
			s.close();
		}
				
		
	//	int[] array1=new int[] {1,2,4,5,9,10};
	    int array2[]={3,5,7,8};
		//int n1=array1.length;
		int n2=array2.length;
		int mergedarray[]=new int[(n1+n2)];
		
		int i=0,j=0,k=0;
		{
			while(i<n1 && j<n2)
				
				if(array1[i]<array2[j])
				{
					mergedarray[k]=array1[i];
					i++;
					k++;
					
				}
				else
				{
					mergedarray[k]=array2[j];
					j++;
					k++;
				}
				while(i<n1) {
					mergedarray[k]=array1[i];
					i++;
					k++;
				}
				
				while(j<n2)
				{
					mergedarray[k]=array2[j];
					j++;
					k++;
					
				}
				for(k=0;k<mergedarray.length;k++)
				{
					System.out.println(mergedarray[k]);
				}
		}
		
		
		
	}
	
}
