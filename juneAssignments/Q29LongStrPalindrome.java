package juneAssignments;

import java.util.Scanner;

public class Q29LongStrPalindrome {
	public static String longestPalindrome(String s) {	
	int n = s.length();
	int index  = -1;
	int maxlength = 0;
	// looping over the string for substrings
	for (int i = 0; i < n; i++) {
		for (int j = i; j < n; j++) {
			int isPalindrome = 1;
			// checking if string is palindrome
			for (int k = i; k <= j; k++) {
				if (s.charAt(k) != s.charAt(j - (k - i))) {
					isPalindrome = 0;
				}
			}
			if (isPalindrome == 1 && j - i + 1 > maxlength) {
				index = i;
				maxlength = j - i + 1;
			}
		}
	}
	// return the substring from updated index till length maxlength
	String ans = "";
	for (int i = index; i < index + maxlength; i++) {
		ans += s.charAt(i);
	}
	return ans;
	}
	public static void main(String[] args){
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter longest string");
		String str=s.nextLine();
    	//String word = new String("findnitianhere");
    	System.out.println(longestPalindrome(str));
    	s.close();
    }

}

