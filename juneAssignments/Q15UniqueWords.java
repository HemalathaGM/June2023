package juneAssignments;

import java.util.Scanner;

public class Q15UniqueWords {
	
	public static void main(String[] args) {
	
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=s.nextLine();
		int count;
		String[] words = str.split("\\W");
		for (int i = 0; i < words.length; i++) {
			 
            // Setting count of current word to one
            count = 1;
 
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equalsIgnoreCase(words[j])) {
 
                    // If word found later in array
                    // increment the count variable
                    count++;
 
                    words[j] = "";
                }
            }
 
            // If count of current word is one print it
            if (count == 1 && words[i] != "")
 
                // Print statement
                System.out.println(words[i]);
		
		s.close();
		}	
	}	

}
