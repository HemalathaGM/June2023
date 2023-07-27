package may26Assignment;

public class Pattern1 {

	public static void main(String[] args) {
		int i;
		int j;
		
		// TODO Auto-generated method stub
		for(i=1;i<=5;i++) {
			
			for(j=1;j<=i;j++) {
				System.out.print("* ");
			}
		    System.out.println(" ");
		}
	
		for(i=4;i>0;i--) {
			for(j=1;j<=i;j++) {
				System.out.print("* ");
	 		}
			System.out.println(" ");
     	}		
	}
	
}	
	
