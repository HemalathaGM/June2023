package juneAssignments;

import java.util.HashMap;

public class Q41HashMap {
	public static void main(String[] args) {
		
		HashMap <String,Integer> h= new HashMap<String, Integer>();
		 
        // Add elements to the hashmap
       h.put("Computer", 151);  
       h.put("Information Technology", 225 );  
       h.put("Electrical", 281);  
       h.put("Civil", 196);  
       System.out.println("HashMap is ");  
       System.out.println(h);

       // replace the Computer's code 
       h.put("Computer", 125); 
       // adding duplicate keys         
       h.put("Civil", 196);  
       System.out.println("After updating the value and adding duplicate keys: ");  
       System.out.println(h);  

       // Print size and content
       System.out.println("Size is:- " + h.size());
       System.out.println(h);
 
       // Checking for the presence of key
       System.out.println("Does hashmap contains Computer? "+h.containsKey("Computer"));
       System.out.println("Does hashmap contains computer? "+h.containsKey("computer"));
       
       // Printing the value for the key
       System.out.println("value for key Electrical is "+h.get("Electrical"));
	}

}
