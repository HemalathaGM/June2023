package juneAssignments;

public class Q10SubSequenStr {
	public static void main(String[] args) {
		
		String str = "Hello Welcome to Java Session";
		System.out.println(str);
		System.out.println("Subsequence of the above string is : " +str.subSequence(6,12));
		
		
		//example of subSequence() method where the index passed is negative.
		//Since this method doesnot accept negative values Exception will be thrown −
		
		
		//System.out.println("Subsequence of the above string with Negative Index & Exception is : " );
		//System.out.println(str.subSequence(-6,12));
		
		// example the index is provided out of range or greater than the length of the given string. 
		//This results in an exception −
		
		//System.out.println("Subsequence of the above string with index out of Range Exception");
		//System.out.println(str.subSequence(5, 60));
		
		//example we are creating a string containing meta characters. 
		//Then we are trying to retrieve the substring with in the range'5-15'. −
		String str1="#@!$%^&*";
		System.out.println("String with meta Character ");
		System.out.println(str1.subSequence(1, 6));
		
	}

}
