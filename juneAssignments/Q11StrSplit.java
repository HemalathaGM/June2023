package juneAssignments;

//11 Q : How to Split String in java?

//Java program to demonstrate working of split(regex,limit) with small limit.


public class Q11StrSplit {
	
	public static void main(String[] args) {
		
		String str="mary.gorli@tekarch.com";
		
		
		//To test beforehand if the string contains certain character(s), 
		//just use String#contains().
		
		if (str.contains("@")) {
		    // Split it.
			System.out.println("Split the string");
			
			String[] arry=str.split("@");
			String array1=arry[0];
			String array2=arry[1];
			
			System.out.println("First half of string is " +array1);
			System.out.println("Length of the First half string " +array1.length());
			
			System.out.println("Second half of string is " +array2);
			System.out.println("Length of the Second half string " +array2.length());
			
			
			
			
		} else {
		    throw new IllegalArgumentException("String " + str + " does not contain @");
		}
	}
	
	

}
