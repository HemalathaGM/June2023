package may31Assignment;

public class SortNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[]= {11,66,33,99,1,6,3,8,10,2};
		int temp;
		System.out.println("Print the Original Array of Numbers before sorting: ");
		for(int i=0;i<A.length;i++) {
			System.out.println(" " +A[i]);
			System.out.println();
		}
		
		System.out.println("Print the Array of Numbers after Sortting:");
		
		for(int i=0;i<A.length;i++) {
			for(int j=i+1;j<A.length;j++) {
				
				if(A[i]>A[j]) {
					temp=A[i];
					A[i]=A[j];
					A[j]=temp;
					
				}
				
			}
		}
		
	
		
		for(int i=0;i<A.length;i++) {
			System.out.println(" " +A[i]);
			System.out.println();
	}
	}		

}
