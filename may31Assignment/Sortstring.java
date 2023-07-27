package may31Assignment;

public class Sortstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String A[]= {"i","am","good","girl","cat","dog","eat","zebra","bad"};
		String temp;
		
		System.out.println("Print the Array before Sorting :");
		for(int i=0;i<A.length;i++) {
			System.out.println(" " +A[i]);
			System.out.println(" ");
				
			
		}
		
		System.out.println("Print Array after sorting: ");
		
		for(int i=0;i<A.length;i++) {
			for(int j=i+1;j<A.length;j++) {
				if(A[i].compareTo(A[j])>0) {
					temp=A[i];
					A[i]=A[j];
					A[j]=temp;
				}
				
				
			}
			  
		}
		
		for(int i=0;i<A.length;i++) {
			System.out.println(" " +A[i]);
			System.out.println(" ");
				
		}

	}

}
